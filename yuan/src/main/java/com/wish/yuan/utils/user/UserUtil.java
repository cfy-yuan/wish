package com.wish.yuan.utils.user;

import com.wish.common.utils.TokenUtil;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname UserUtil
 * @Description :
 * @Date 2021/8/9 14:52
 * @Author cfy
 */
public class UserUtil {

    /**
     * 获取用户id
     *
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/8/9 14:53
     * @version: 0.0.1
     */
    public static Long getUserId(){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String token = request.getHeader(TokenUtil.TOKEN);
        String tokenUserId = TokenUtil.getTokenUserId(token);
        return Long.valueOf(tokenUserId);
    }
}
