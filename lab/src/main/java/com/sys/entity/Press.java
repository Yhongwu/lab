package com.sys.entity;

public class Press {
    private Integer pId;

    private String pTitle;

    private String pUrl;

    private String pTime;

    private String pSummary;

    private String pContent2;

    private String pVurl;

    private Integer pStatus;

    private String pContent;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpTitle() {
        return pTitle;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle == null ? null : pTitle.trim();
    }

    public String getpUrl() {
        return pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl == null ? null : pUrl.trim();
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime == null ? null : pTime.trim();
    }

    public String getpSummary() {
        return pSummary;
    }

    public void setpSummary(String pSummary) {
        this.pSummary = pSummary == null ? null : pSummary.trim();
    }

    public String getpContent2() {
        return pContent2;
    }

    public void setpContent2(String pContent2) {
        this.pContent2 = pContent2 == null ? null : pContent2.trim();
    }

    public String getpVurl() {
        return pVurl;
    }

    public void setpVurl(String pVurl) {
        this.pVurl = pVurl == null ? null : pVurl.trim();
    }

    public Integer getpStatus() {
        return pStatus;
    }

    public void setpStatus(Integer pStatus) {
        this.pStatus = pStatus;
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent == null ? null : pContent.trim();
    }
}