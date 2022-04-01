package com.wish.yuan.logic.log.entity;

import com.wish.yuan.entity.BaseEntity;

/**
 * @author yuan
 * @Date 2021-07-12
 */
public class LogEntity extends BaseEntity {

    /**
     *方法日志
     */
    public static final String TYPE_1000 ="1000";
    /**
     * 请求日志
     */
    public static final String TYPE_1001 ="1001";
    /**
     *
     */
    public static final String TYPE_1002 ="1002";
    /**
     *
     */
    public static final String TYPE_1003 ="1003";
    /**
     * 日志id
     */
    private Long logId;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 类型
     */
    private String logType;



    /**
     * 错误日志
     */
    private String contentText;

    public LogEntity() {
    }

    /**
     * 日志id
     * @return log_id
     */
    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    /**
     * 用户id
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 类型
     * @return log_type
     */
    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * 错误日志
     * @return content_text
     */
    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }
}