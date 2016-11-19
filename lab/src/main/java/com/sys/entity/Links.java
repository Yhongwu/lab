package com.sys.entity;

public class Links {
    private Integer lId;

    private String lName;

    private String lUrl;

    private Integer status;

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName == null ? null : lName.trim();
    }

    public String getlUrl() {
        return lUrl;
    }

    public void setlUrl(String lUrl) {
        this.lUrl = lUrl == null ? null : lUrl.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}