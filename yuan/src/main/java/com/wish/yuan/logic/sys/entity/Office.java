package com.wish.yuan.logic.sys.entity;

import com.wish.yuan.entity.BaseEntity;

/**
 * @author yuan
 * @Date 2021-07-22
 */
public class Office extends BaseEntity {

    /**
     * 机构显示
     */
    public static final String OFFICE_STATUS_OK ="0";
    /**
     * 机构隐藏
     */
    public static final String OFFICE_STATUS_ERROR ="1";
    /**
     * 机构id
     */
    private Long officeId;

    /**
     * 上级机构id
     */
    private Long superiorId;

    /**
     * 上级机构id集合String类型
     */
    private String superiorIds;

    /**
     * 机构类型
     */
    private String type;

    /**
     * 机构名称
     */
    private String name;

    /**
     * 机构编码
     */
    private String code;
    /**
     * 机构排序
     */
    private Integer sort;
    /**
     * 机构图标
     */
    private String icon;
    /**
     * 机构显示与隐藏（0 显示 1 隐藏）
     */
    private String officeStatus;

    /**
     * 机构地址
     */
    private String officePath;

    /**
     * 机构电话
     */
    private String officePhone;

    /**
     * 机构邮箱
     */
    private String officeEmail;


    public Office() {
    }

    /**
     * 机构id
     * @return office_id
     */
    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }



    /**
     * 上级机构id
     * @return superior_id
     */
    public Long getSuperiorId() {
        return superiorId;
    }

    public void setSuperiorId(Long superiorId) {
        this.superiorId = superiorId;
    }

    /**
     * 上级机构id集合String类型
     * @return superior_ids
     */
    public String getSuperiorIds() {
        return superiorIds;
    }

    public void setSuperiorIds(String superiorIds) {
        this.superiorIds = superiorIds;
    }

    /**
     * 机构类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 机构名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 机构编码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getOfficeStatus() {
        return officeStatus;
    }

    public void setOfficeStatus(String officeStatus) {
        this.officeStatus = officeStatus;
    }

    /**
     * 机构地址
     * @return office_path
     */
    public String getOfficePath() {
        return officePath;
    }

    public void setOfficePath(String officePath) {
        this.officePath = officePath;
    }

    /**
     * 机构电话
     * @return office_phone
     */
    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    /**
     * 机构邮箱
     * @return office_email
     */
    public String getOfficeEmail() {
        return officeEmail;
    }

    public void setOfficeEmail(String officeEmail) {
        this.officeEmail = officeEmail;
    }


}