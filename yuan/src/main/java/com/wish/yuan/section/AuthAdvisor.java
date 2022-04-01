package com.wish.yuan.section;

import com.wish.common.code.ProjectCode;
import com.wish.common.entity.ResponseEntity;
import com.wish.common.utils.ObjectUtil;
import com.wish.common.utils.TokenUtil;
import com.wish.yuan.section.authority.Authority;
import com.wish.yuan.utils.redis.RedisUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Set;

/**
 * @Classname AuthAdvisor
 * @Description :
 * @Date 2021/7/19 15:07
 * @Author cfy
 */
@Aspect
@Component
public class AuthAdvisor {
    private Logger logger = LoggerFactory.getLogger(AuthAdvisor.class);

    @Around("execution(* com.wish.yuan.logic.*.web.*.*(..))")
    public Object goBefore(ProceedingJoinPoint jp) {
        MethodSignature signature = (MethodSignature) jp.getSignature();
        Method method = signature.getMethod();
        Authority annotation = method.getAnnotation(Authority.class);
        Object proceed = null;
        if (ObjectUtil.isObjectNotBlank(annotation)) {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();
            String token = request.getHeader(TokenUtil.TOKEN);
            String tokenUserId = TokenUtil.getTokenUserId(token);
            Set<String> userAuthority = (Set<String>) RedisUtil.hashGet(tokenUserId, "userAuthority");
            String[] value = annotation.value();
            boolean userStatus = false;
            for (String methodAuth : value) {
                for (String auth : userAuthority) {
                    if (methodAuth.equals(auth)) {
                        userStatus = true;
                        break;
                    }
                }
            }
            if (userStatus) {
                try {
                    proceed = jp.proceed();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }

            } else {
                ResponseEntity responseEntity = new ResponseEntity();
                responseEntity.setCode(ProjectCode.NO_PERMISSION.getCode());
                responseEntity.setMsg(ProjectCode.NO_PERMISSION.getMsg());
                return responseEntity;
            }
        }else{
            try {
                proceed = jp.proceed();
            } catch (Throwable throwable) {
                // 添加日志
                throwable.printStackTrace();
            }
        }

        return proceed;
    }
}
