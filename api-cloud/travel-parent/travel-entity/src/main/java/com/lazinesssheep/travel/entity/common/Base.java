package com.lazinesssheep.travel.entity.common;

import java.io.Serializable;

public class Base implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    /*可用状态*/
    private String status;

    /*创建时间*/
    private String createTime;

    /*创建人*/
    private String createUser;

    /*修改时间*/
    private String updateTime;

    /*修改人*/
    private String updateUser;

    /*偏移量*/
    private String offset;

    /*页大小*/
    private String pageSize;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}
