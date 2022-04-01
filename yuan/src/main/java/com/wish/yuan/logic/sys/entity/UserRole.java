package com.wish.yuan.logic.sys.entity;

import com.wish.yuan.entity.BaseEntity;

/**
 * @Date 2021-08-15
 * @Author yuan 
 */
public class UserRole extends BaseEntity {

    /** 
     * 用户id
     */
    private Long userId;

    /** 
     * 角色id
     */
    private Long roleId;

    /**
     * 用户id
     * @return user_id
     * @Author yuan 
     */
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 角色id
     * @return role_id
     * @Author yuan 
     */
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

}