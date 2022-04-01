package com.wish.yuan.responseentity.user;


import com.wish.yuan.entity.BaseEntity;

import java.util.Date;

/**
 * @Classname UserResponseEntity
 * @Description :
 * @Date 2021/7/10 11:48
 * @Author cfy
 */
public class UserResponseEntity extends BaseEntity {
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
     * 昵称
     */
    private String nickname;

    /**
     * 身份证号
     */
    private String identityNumber;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 职业
     */
    private String position;

    /**
     * vip类型
     */
    private String vipType;

    /**
     * vip结束时间
     */
    private Date vipTime;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public Date getVipTime() {
        return vipTime;
    }

    public void setVipTime(Date vipTime) {
        this.vipTime = vipTime;
    }
}
