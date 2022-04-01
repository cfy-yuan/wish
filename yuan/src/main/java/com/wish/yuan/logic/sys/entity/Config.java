package com.wish.yuan.logic.sys.entity;

import com.wish.yuan.entity.BaseEntity;

/**
 * @Date 2021-08-09
 * @Author yuan 
 */
public class Config extends BaseEntity {


    /** 
     * 
     */
    private Integer configId;

    /** 
     * 背景图片
     */
    private String backImgPath;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 项目图标
     */
    private String projectImg;
    /**
     * 导航log
     */
    private String navigationImg;

    /** 
     * 登录框的背景图片
     */
    private String loginImgPath;
    /**
     * 多语言配置
     */
    private String isLanguage;

    /** 
     * 注册按钮是否显示
     */
    private String isRegister;

    /** 
     * 球球登录是否显示
     */
    private String isQq;

    /** 
     * 微信登录是否显示
     */
    private String isWx;

    /** 
     * 是否显示下标模块
     */
    private String isSubscript;

    /** 
     * 归属项目集
     */
    private String project;



    /**
     * 
     * @return config_id
     * @Author yuan 
     */
    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    /**
     * 背景图片
     * @return back_img_path
     * @Author yuan 
     */
    public String getBackImgPath() {
        return backImgPath;
    }

    public void setBackImgPath(String backImgPath) {
        this.backImgPath = backImgPath;
    }

    /**
     * 登录框的背景图片
     * @return login_img_path
     * @Author yuan 
     */
    public String getLoginImgPath() {
        return loginImgPath;
    }

    public void setLoginImgPath(String loginImgPath) {
        this.loginImgPath = loginImgPath;
    }

    /**
     * 注册按钮是否显示
     * @return is_register
     * @Author yuan 
     */
    public String getIsRegister() {
        return isRegister;
    }

    public void setIsRegister(String isRegister) {
        this.isRegister = isRegister;
    }

    /**
     * 球球登录是否显示
     * @return is_qq
     * @Author yuan 
     */
    public String getIsQq() {
        return isQq;
    }

    public void setIsQq(String isQq) {
        this.isQq = isQq;
    }

    /**
     * 微信登录是否显示
     * @return is_wx
     * @Author yuan 
     */
    public String getIsWx() {
        return isWx;
    }

    public void setIsWx(String isWx) {
        this.isWx = isWx;
    }

    /**
     * 是否显示下标模块
     * @return is_subscript
     * @Author yuan 
     */
    public String getIsSubscript() {
        return isSubscript;
    }

    public void setIsSubscript(String isSubscript) {
        this.isSubscript = isSubscript;
    }

    /**
     * 归属项目集
     * @return project
     * @Author yuan 
     */
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
    /**
     * 项目名称
     * @return project
     * @Author yuan
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    /**
     * 项目图标
     * @return project
     * @Author yuan
     */
    public String getProjectImg() {
        return projectImg;
    }

    public void setProjectImg(String projectImg) {
        this.projectImg = projectImg;
    }
    /**
     * 导航log
     * @return project
     * @Author yuan
     */
    public String getNavigationImg() {
        return navigationImg;
    }

    public void setNavigationImg(String navigationImg) {
        this.navigationImg = navigationImg;
    }

    public String getIsLanguage() {
        return isLanguage;
    }

    public void setIsLanguage(String isLanguage) {
        this.isLanguage = isLanguage;
    }
}