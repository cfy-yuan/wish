package com.wish.yuan.logic.sys.entity;

/**
 * @Date 2021-08-15
 * @Author yuan 
 */
public class RoleAuthority {

    /** 
     * 角色id
     */
    private Long roleId;

    /** 
     * 权限id
     */
    private Long authorityId;

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


}