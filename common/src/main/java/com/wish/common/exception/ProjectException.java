package com.wish.common.exception;

/**
 * @Classname ProjectException
 * @Description :
 * @Date 2021/7/9 21:13
 * @Author cfy
 */
public class ProjectException extends RuntimeException{
    public ProjectException() {
        super();
    }

    public ProjectException(String message) {
        super(message);
    }

    public ProjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProjectException(Throwable cause) {
        super(cause);
    }

    protected ProjectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
