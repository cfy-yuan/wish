package com.wish.common.code;

/**
 * 只用于登录，登录状态码
 *
 * @Classname UserStatusCode
 * @Description :
 * @Date 2021/3/8 19:13
 * @Author cfy
 */
public enum UserStatusCode {

    /**
     * 用户不存在
     */
    DEL("1001", "用户不存在!"),

    /**
     * 该账号已冻结
     */
    FREEZE("1003", "该账号已冻结!"),

    /**
     * 账号正常
     */
    OK("1002", "账号正常!"),

    /**
     * 账号异常
     */
    ERROR("1004", "账号异常!"),

    /**
     * 账号已存在
     */
    EXIST("1005", "账号已存在!"),

    /**
     * 密码错误
     */
    PASSWORD_ERROR("1006", "密码错误!");

    private String code;
    private String msg;

    UserStatusCode(String code, String msg) {
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
