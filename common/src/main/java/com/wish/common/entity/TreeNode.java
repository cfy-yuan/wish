package com.wish.common.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname TreeNode
 * @Description :
 * @Date 2021/7/23 10:24
 * @Author cfy
 */
public class TreeNode<T> {

    private Long id;
    private Long pId;
    private String name;
    private String pIds;
    private String status;
    private String icon;
    private List<T> children = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpIds() {
        return pIds;
    }

    public void setpIds(String pIds) {
        this.pIds = pIds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<T> getChildren() {
        return children;
    }

    public void setChildren(List<T> children) {
        this.children = children;
    }
}
