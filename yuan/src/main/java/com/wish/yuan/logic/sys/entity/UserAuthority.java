package com.wish.yuan.logic.sys.entity;

import com.wish.yuan.entity.BaseEntity;

/**
 * @Date 2021-08-15
 * @Author yuan 
 */
public class UserAuthority extends BaseEntity {

    /** 
     * 权限id
     */
    private Long authorityId;

    /** 
     * 用户id
     */
    private Long userId;

    /**
     * 权限id
     * @return authority_id
     * @Author yuan 
     */
    public Long getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }

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


}