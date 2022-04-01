package com.wish.yuan.logic.user.entity;

import com.wish.yuan.entity.BaseEntity;

/**
 * @author yuan
 * @Date 2021-07-10
 */
public class UserLogin  extends BaseEntity {
    /**
     *
     */
    private String wishId;

    /**
     * 用户唯一标识
     */
    private Long userId;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mailbox;

    /**
     * 密码
     */
    private String password;

    /**
     * 秘钥
     */
    private String uuid;

    /**
     * 可用状态（2000 可用 2001 冻结 2002 预留标识 2003 删除）
     */
    private String userStatus;

    /**
     * 创建类型(1001 pc 1002 phone)
     */
    private String createType;
    /**
     *  微信id
     */
    private String wxId;
    /**
     *  qqId
     */
    private String qqId;

    public String getWishId() {
        return wishId;
    }

    public void setWishId(String wishId) {
        this.wishId = wishId;
    }

    /**
     * 用户唯一标识
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 登录名
     * @return login_name
     */
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 手机号
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 邮箱
     * @return mailbox
     */
    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    /**
     * 密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 秘钥
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    /**
     * 创建类型(1001 pc 1002 phone)
     * @return create_type
     */
    public String getCreateType() {
        return createType;
    }

    public void setCreateType(String createType) {
        this.createType = createType;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getQqId() {
        return qqId;
    }

    public void setQqId(String qqId) {
        this.qqId = qqId;
    }
}