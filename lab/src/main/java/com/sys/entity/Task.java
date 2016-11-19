package com.sys.entity;

public class Task {
    private Integer tId;

    private String title;

    private String tUrl;

    private String uTime;

    private Integer status;

    private String details;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String gettUrl() {
        return tUrl;
    }

    public void settUrl(String tUrl) {
        this.tUrl = tUrl == null ? null : tUrl.trim();
    }

    public String getuTime() {
        return uTime;
    }

    public void setuTime(String uTime) {
        this.uTime = uTime == null ? null : uTime.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }
}