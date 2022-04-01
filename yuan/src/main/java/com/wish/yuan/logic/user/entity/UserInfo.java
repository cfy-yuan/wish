package com.wish.yuan.logic.user.entity;

import com.wish.yuan.entity.BaseEntity;

import java.util.Date;

/**
 * @author yuan
 * @Date 2021-07-10
 */
public class UserInfo extends BaseEntity {
    /**
     * 用户id
     */
    private Long userId;

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

    /**
     * 升级状态（0不升级，1 升级）
     */
    private String vipUpgradeStatus;


    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 用户id
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 昵称
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 身份证号
     * @return identity_number
     */
    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    /**
     * 生日
     * @return birthday
     */
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 头像
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 职业
     * @return position
     */
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * vip类型
     * @return vip_type
     */
    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    /**
     * vip结束时间
     * @return vip_time
     */
    public Date getVipTime() {
        return vipTime;
    }

    public void setVipTime(Date vipTime) {
        this.vipTime = vipTime;
    }

    /**
     * 升级状态（0不升级，1 升级）
     * @return vip_upgrade_status
     */
    public String getVipUpgradeStatus() {
        return vipUpgradeStatus;
    }

    public void setVipUpgradeStatus(String vipUpgradeStatus) {
        this.vipUpgradeStatus = vipUpgradeStatus;
    }


    /**
     * 更新人
     * @return update_by
     */
    @Override
    public String getUpdateBy() {
        return updateBy;
    }

    @Override
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 更新时间
     * @return update_time
     */
    @Override
    public Date getUpdateTime() {
        return updateTime;
    }

    @Override
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}