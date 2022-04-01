package com.wish.yuan.decrypt;

import com.wish.common.code.ProjectCode;
import com.wish.common.coding.Coding;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;

/**
 * @Classname GlobalRequestBodyAdvice
 * @Description :
 * @Date 2021/7/21 11:06
 * @Author cfy
 */
public class GlobalRequestBodyAdvice/* implements RequestBodyAdvice*/ {
    /*@Override
    public boolean supports(MethodParameter methodParameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
        return false;
    }

    @Override
    public HttpInputMessage beforeBodyRead(HttpInputMessage inputMessage, MethodParameter parameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) throws IOException {
        return new YuanInputMessage(inputMessage, Coding.UTF8.getCoding());
    }

    @Override
    public Object afterBodyRead(Object body, HttpInputMessage inputMessage, MethodParameter parameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
        return inputMessage;
    }

    @Override
    public Object handleEmptyBody(Object body, HttpInputMessage inputMessage, MethodParameter parameter, Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
        return body;
    }
    *//**
     * 解密逻辑
     * @author: cfy
     * @date: 2021/7/21 11:20
     * @version: 0.0.1
     *//*
    class YuanInputMessage implements HttpInputMessage{
        private HttpHeaders httpHeaders;
        private InputStream body;

        public YuanInputMessage(HttpInputMessage httpInputMessage, String encode) {
            this.httpHeaders = httpInputMessage.getHeaders();
            this.body = body;
        }

        private InputStream decrypt(InputStream body, String encode){


            return body;
        }

        @Override
        public InputStream getBody() throws IOException {
            return body;
        }

        @Override
        public HttpHeaders getHeaders() {
            return null;
        }
    }*/
}
