package com.wish.yuan.logic.sys.entity;

import com.wish.yuan.entity.BaseEntity;

/**
 * @Date 2021-08-15
 * @Author yuan 
 */
public class Authority extends BaseEntity {

    /** 
     * 权限id
     */
    private Long authorityId;

    /** 
     * 父级权限id
     */
    private Long authoritySuperiorId;

    /** 
     * 父级id集合
     */
    private String authoritySuperiorIds;

    /** 
     * 权限名
     */
    private String authorityName;

    /** 
     * 权限类型
     */
    private String authorityType;


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
     * 父级权限id
     * @return authority_superior_id
     * @Author yuan 
     */
    public Long getAuthoritySuperiorId() {
        return authoritySuperiorId;
    }

    public void setAuthoritySuperiorId(Long authoritySuperiorId) {
        this.authoritySuperiorId = authoritySuperiorId;
    }

    /**
     * 父级id集合
     * @return authority_superior_ids
     * @Author yuan 
     */
    public String getAuthoritySuperiorIds() {
        return authoritySuperiorIds;
    }

    public void setAuthoritySuperiorIds(String authoritySuperiorIds) {
        this.authoritySuperiorIds = authoritySuperiorIds;
    }

    /**
     * 权限名
     * @return authority_name
     * @Author yuan 
     */
    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    /**
     * 权限类型
     * @return authority_type
     * @Author yuan 
     */
    public String getAuthorityType() {
        return authorityType;
    }

    public void setAuthorityType(String authorityType) {
        this.authorityType = authorityType;
    }


}