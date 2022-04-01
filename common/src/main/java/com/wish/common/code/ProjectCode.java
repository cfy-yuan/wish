package com.wish.common.code;

/**
 * 接口返回状态码
 *
 * @Classname ProjectCode
 * @Description :
 * @Date 2021/3/8 19:14
 * @Author cfy
 */
public enum ProjectCode {
    /**
     * ok
     */
    OK("2002", "ok"),
    /**
     * error
     */
    ERROR("2004", "error"),
    /**
     * parameter is null
     */
    PARAMETER_ERROR("2003", "parameter is null"),
    /**
     * token is expired
     */
    TOKENEXPIRED("2005", "token is expired"),
    /**
     * token is invalid
     */
    TOKENINVALID("2006", "token is invalid"),
    /**
     * No permission
     */
    NO_PERMISSION("4005", "No permission");

    private String code;
    private String msg;

    ProjectCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
