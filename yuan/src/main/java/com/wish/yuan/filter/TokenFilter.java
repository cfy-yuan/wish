package com.wish.yuan.filter;


import com.wish.common.code.ProjectCode;
import com.wish.common.coding.Coding;
import com.wish.common.entity.ResponseEntity;
import com.wish.common.utils.ObjectUtil;
import com.wish.common.utils.StringUtil;
import com.wish.common.utils.TokenUtil;
import com.wish.yuan.logic.log.entity.LogEntity;
import com.wish.yuan.thread.utils.ThreadLogUtil;
import com.wish.yuan.utils.redis.RedisUtil;
import com.wish.yuan.utils.snowflake.SnowFlakeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * token 过滤 非请求登录过滤
 *
 * @author: cfy
 * @date: 2021/3/9 13:41
 * @version: 0.0.1
 */


@WebFilter(filterName = "/tokenFilter", urlPatterns = "/*")
@Order(1)
public class TokenFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(TokenFilter.class);
    private static final String LOGIN_PATH = "/yuan/login/toLogin";
    private static final String USER_TEST = "/yuan/user/userTest";
    private static final String PROJECT_SETTING_CONFIG = "/yuan/sys/config";
    private static final String CREATE_ORDER = "/yuan/order/createOrder";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        request.setCharacterEncoding(Coding.UTF8.getCoding());
        response.setCharacterEncoding(Coding.UTF8.getCoding());
        String token = request.getHeader("token");
        String requestUri = request.getRequestURI();
        ResponseEntity responseEntity = new ResponseEntity();

        if (!LOGIN_PATH.equals(requestUri)) {

            if (CREATE_ORDER.equals(requestUri)) {
                chain.doFilter(request, response);
                return;
            }
            if (PROJECT_SETTING_CONFIG.equals(requestUri)) {
                chain.doFilter(request, response);
                return;
            }
            if (StringUtil.isEmpty(token)) {
                formatTokenInvalid(responseEntity,servletResponse);
                return;
            } else if (!TokenUtil.verify(token)) {
                responseEntity.setCode(ProjectCode.TOKENEXPIRED.getCode());
                responseEntity.setMsg(ProjectCode.TOKENEXPIRED.getMsg());
                ServletOutputStream outputStream = servletResponse.getOutputStream();
                String responseJson = responseEntity.toString();
                byte[] bytes = responseJson.getBytes(StandardCharsets.UTF_8);
                outputStream.write(bytes);
                return;
            } else {
                String tokenUserId = TokenUtil.getTokenUserId(token);
                if (StringUtil.isNotEmpty(tokenUserId)) {

                    LogEntity logEntity = new LogEntity();
                    logEntity.setLogId(SnowFlakeUtil.nextId());
                    logEntity.setUserId(tokenUserId);
                    logEntity.setContentText(requestUri);
                    logEntity.setLogType(LogEntity.TYPE_1001);
                    logEntity.init();
                    ThreadLogUtil.addThread(logEntity);

                    Object o = RedisUtil.hashGet(tokenUserId,TokenUtil.TOKEN);
                    // 项目登录
                    if (ObjectUtil.isObjectNotBlank(o)) {
                        String tokenLoginId = TokenUtil.getTokenLoginId(token);
                        String tokenRedisLoginId = TokenUtil.getTokenLoginId(o.toString());
                        // 唯一登录验证
                        if (!tokenLoginId.equals(tokenRedisLoginId)) {
                            formatTokenInvalid(responseEntity,servletResponse);
                            return;
                        }
                    } else {
                        formatTokenInvalid(responseEntity,servletResponse);
                        return;
                    }
                } else {

                    return;
                }

                RedisUtil.expire(tokenUserId, TokenUtil.DEFAULT_TIME);
                String newToken = TokenUtil.updateToken(token, TokenUtil.DEFAULT_TIME);
                response.setHeader("token", newToken);
                chain.doFilter(request, response);
            }
        } else {
            chain.doFilter(request, response);
        }
    }
    private void formatTokenInvalid(ResponseEntity responseEntity , ServletResponse servletResponse) throws IOException {
        responseEntity.setCode(ProjectCode.TOKENINVALID.getCode());
        responseEntity.setMsg(ProjectCode.TOKENINVALID.getMsg());
        ServletOutputStream outputStream = servletResponse.getOutputStream();
        String responseJson = responseEntity.toString();
        byte[] bytes = responseJson.getBytes(StandardCharsets.UTF_8);
        outputStream.write(bytes);
    }

    @Override
    public void destroy() {

    }
}
