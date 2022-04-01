package com.wish.yuan.logic.sys.entity;

import com.wish.yuan.entity.BaseEntity;

/**
 * 角色
 * @Date 2021-08-15
 * @Author yuan 
 */
public class Role extends BaseEntity {

    /** 
     * 角色id
     */
    private Long roleId;

    /** 
     * 上级角色id
     */
    private Long roleSuperiorId;

    /** 
     * 上级集合
     */
    private String roleSuperiorIds;

    /** 
     * 角色名称
     */
    private String roleName;

    /** 
     * 角色类型
     */
    private String roleType;

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
     * 上级角色id
     * @return role_superior_id
     * @Author yuan 
     */
    public Long getRoleSuperiorId() {
        return roleSuperiorId;
    }

    public void setRoleSuperiorId(Long roleSuperiorId) {
        this.roleSuperiorId = roleSuperiorId;
    }

    /**
     * 上级集合
     * @return role_superior_ids
     * @Author yuan 
     */
    public String getRoleSuperiorIds() {
        return roleSuperiorIds;
    }

    public void setRoleSuperiorIds(String roleSuperiorIds) {
        this.roleSuperiorIds = roleSuperiorIds;
    }

    /**
     * 角色名称
     * @return role_name
     * @Author yuan 
     */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 角色类型
     * @return role_type
     * @Author yuan 
     */
    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }


}