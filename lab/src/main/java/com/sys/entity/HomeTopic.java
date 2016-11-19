package com.sys.entity;

public class HomeTopic {
    private Integer hId;

    private String hUrl;

    private Integer hStatus;

    private Integer hNumber;

    private String hTitle;

    private String hContent;

    private String hSummary;

    private String hTime;

    private String hContent2;

    private String hVurl;

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String gethUrl() {
        return hUrl;
    }

    public void sethUrl(String hUrl) {
        this.hUrl = hUrl == null ? null : hUrl.trim();
    }

    public Integer gethStatus() {
        return hStatus;
    }

    public void sethStatus(Integer hStatus) {
        this.hStatus = hStatus;
    }

    public Integer gethNumber() {
        return hNumber;
    }

    public void sethNumber(Integer hNumber) {
        this.hNumber = hNumber;
    }

    public String gethTitle() {
        return hTitle;
    }

    public void sethTitle(String hTitle) {
        this.hTitle = hTitle == null ? null : hTitle.trim();
    }

    public String gethContent() {
        return hContent;
    }

    public void sethContent(String hContent) {
        this.hContent = hContent == null ? null : hContent.trim();
    }

    public String gethSummary() {
        return hSummary;
    }

    public void sethSummary(String hSummary) {
        this.hSummary = hSummary == null ? null : hSummary.trim();
    }

    public String gethTime() {
        return hTime;
    }

    public void sethTime(String hTime) {
        this.hTime = hTime == null ? null : hTime.trim();
    }

    public String gethContent2() {
        return hContent2;
    }

    public void sethContent2(String hContent2) {
        this.hContent2 = hContent2 == null ? null : hContent2.trim();
    }

    public String gethVurl() {
        return hVurl;
    }

    public void sethVurl(String hVurl) {
        this.hVurl = hVurl == null ? null : hVurl.trim();
    }
}