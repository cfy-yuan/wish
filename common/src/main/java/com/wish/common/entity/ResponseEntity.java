package com.wish.common.entity;

import com.wish.common.utils.ObjectUtil;
import com.wish.common.utils.DateUtil;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * @Classname ResponseEntity
 * @Description :
 * @Date 2021/3/8 19:19
 * @Author cfy
 */
public class ResponseEntity<T> implements Serializable {

    private static final long serialVersionUID = -8785105893365804438L;
    private String code;
    private String msg;
    private T data;
    private Date date;
    private Integer count;
    public ResponseEntity() {
        this.date = new Date();
    }

    public ResponseEntity(String code, String msg) {
        this.code = code;
        this.msg = msg;
        this.date = new Date();
    }

    public ResponseEntity(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.date = new Date();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Date getDate() {
        if (ObjectUtil.isObjectBlank(this.data)) {
            this.data = (T) DateUtil.getDate();
        }
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
