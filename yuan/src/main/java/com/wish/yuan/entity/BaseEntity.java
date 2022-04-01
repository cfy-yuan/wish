package com.wish.yuan.entity;


import com.wish.common.utils.DateUtil;
import com.wish.yuan.utils.snowflake.SnowFlakeUtil;
import com.wish.yuan.utils.user.UserUtil;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yuan
 */
public class BaseEntity implements Serializable {
    private static final String OK = "0";
    private static final String ERROR = "1";
    private static final long serialVersionUID = -6161902691962520364L;
    private Long id;
    private String createBy;
    private String updateBy;
    private Date createTime;
    private Date updateTime;
    private Date startDate;
    private Date endDate;
    private String delStatus;
    /**
     * 开始位置
     */
    private Integer startPosition;
    /**
     * 结束位置
     */
    private Integer endPosition;

    public BaseEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(String delStatus) {
        this.delStatus = delStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Integer startPosition) {
        this.startPosition = startPosition;
    }

    public Integer getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Integer endPosition) {
        this.endPosition = endPosition;
    }

    public void init() {
        this.id = SnowFlakeUtil.nextId();
        this.delStatus = OK;
        this.createTime = DateUtil.getDate();
        this.createBy = String.valueOf(UserUtil.getUserId());
    }

    public void update() {
        this.updateTime = DateUtil.getDate();
        this.updateBy = String.valueOf(UserUtil.getUserId());
    }

    public void delete() {
        this.delStatus = ERROR;
        this.updateTime = DateUtil.getDate();
        this.updateBy = String.valueOf(UserUtil.getUserId());
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
