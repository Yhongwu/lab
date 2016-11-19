package com.sys.entity;

public class Photo {
    private Integer pId;

    private String pUrl;

    private String pShow;

    private Integer pStatus;

    private Integer pLaborteam;

    private String pYear;

    private String pTime;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpUrl() {
        return pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl == null ? null : pUrl.trim();
    }

    public String getpShow() {
        return pShow;
    }

    public void setpShow(String pShow) {
        this.pShow = pShow == null ? null : pShow.trim();
    }

    public Integer getpStatus() {
        return pStatus;
    }

    public void setpStatus(Integer pStatus) {
        this.pStatus = pStatus;
    }

    public Integer getpLaborteam() {
        return pLaborteam;
    }

    public void setpLaborteam(Integer pLaborteam) {
        this.pLaborteam = pLaborteam;
    }

    public String getpYear() {
        return pYear;
    }

    public void setpYear(String pYear) {
        this.pYear = pYear == null ? null : pYear.trim();
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime == null ? null : pTime.trim();
    }
}