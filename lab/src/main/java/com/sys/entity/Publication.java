package com.sys.entity;

public class Publication {
    private Integer pId;

    private String pYear;

    private String pTime;

    private String uTime;

    private String pContent;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
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

    public String getuTime() {
        return uTime;
    }

    public void setuTime(String uTime) {
        this.uTime = uTime == null ? null : uTime.trim();
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent == null ? null : pContent.trim();
    }
}