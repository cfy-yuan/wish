package com.wish.yuan.logic.sys.entity;

import com.wish.yuan.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2021-08-14
 * @Author yuan 
 */
public class Navigation extends BaseEntity {


    /** 
     * 路由id
     */
    private Long navigationId;

    /** 
     * 路由上级id
     */
    private Long navigationSuperiorId;

    /** 
     * 路由上级id集合
     */
    private String superiorIds;

    /** 
     * 路由title
     */
    private String navigationTitle;

    /** 
     * 路由名称
     */
    private String navigationName;

    /** 
     * 路由图片
     */
    private String navigationImg;

    /** 
     * 路由路径
     */
    private String navigationPath;

    /** 
     * 路由排序
     */
    private String navigationSort;
    /**
     * 模糊查询
     */
    private String findIds;
    /**
     * 权限信息
     */
    private List<String> authorityType;
    /**
     * 用户角色信息
     */
    private List<Long> roleList;
    /**
     * 数机构集
     */
    private List<Navigation> child = new ArrayList<>();



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
     * 路由上级id
     * @return navigation_superior_id
     * @Author yuan 
     */
    public Long getNavigationSuperiorId() {
        return navigationSuperiorId;
    }

    public void setNavigationSuperiorId(Long navigationSuperiorId) {
        this.navigationSuperiorId = navigationSuperiorId;
    }

    /**
     * 路由上级id集合
     * @return superior_ids
     * @Author yuan 
     */
    public String getSuperiorIds() {
        return superiorIds;
    }

    public void setSuperiorIds(String superiorIds) {
        this.superiorIds = superiorIds;
    }

    /**
     * 路由title
     * @return navigation_title
     * @Author yuan 
     */
    public String getNavigationTitle() {
        return navigationTitle;
    }

    public void setNavigationTitle(String navigationTitle) {
        this.navigationTitle = navigationTitle;
    }

    /**
     * 路由名称
     * @return navigation_name
     * @Author yuan 
     */
    public String getNavigationName() {
        return navigationName;
    }

    public void setNavigationName(String navigationName) {
        this.navigationName = navigationName;
    }

    /**
     * 路由图片
     * @return navigation_img
     * @Author yuan 
     */
    public String getNavigationImg() {
        return navigationImg;
    }

    public void setNavigationImg(String navigationImg) {
        this.navigationImg = navigationImg;
    }

    /**
     * 路由路径
     * @return navigation_path
     * @Author yuan 
     */
    public String getNavigationPath() {
        return navigationPath;
    }

    public void setNavigationPath(String navigationPath) {
        this.navigationPath = navigationPath;
    }

    /**
     * 路由排序
     * @return navigation_sort
     * @Author yuan 
     */
    public String getNavigationSort() {
        return navigationSort;
    }

    public void setNavigationSort(String navigationSort) {
        this.navigationSort = navigationSort;
    }

    public String getFindIds() {
        return findIds;
    }

    public void setFindIds(String findIds) {
        this.findIds = findIds;
    }

    public List<Navigation> getChild() {
        return child;
    }

    public void setChild(List<Navigation> child) {
        this.child = child;
    }

    public List<Long> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Long> roleList) {
        this.roleList = roleList;
    }

    public List<String> getAuthorityType() {
        return authorityType;
    }

    public void setAuthorityType(List<String> authorityType) {
        this.authorityType = authorityType;
    }
}