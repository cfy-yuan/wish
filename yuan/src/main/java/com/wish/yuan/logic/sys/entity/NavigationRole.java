package com.wish.yuan.logic.sys.entity;

import com.wish.yuan.entity.BaseEntity;

/**
 * @Date 2021-08-15
 * @Author yuan 
 */
public class NavigationRole extends BaseEntity {


    /** 
     * 路由id
     */
    private Long navigationId;

    /** 
     * 角色id
     */
    private Long roleId;

    /**
     * 路由id
     * @return navigation_id
     * @Author yuan 
     */
    public Long getNavigationId() {
        return navigationId;
    }

    public void setNavigationId(Long navigationId) {
        this.navigationId = navigationId;
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