package com.sys.entity;

public class User {
    private Integer uId;

    private String uName;

    private String uPassword;

    private String uLogtime;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuLogtime() {
        return uLogtime;
    }

    public void setuLogtime(String uLogtime) {
        this.uLogtime = uLogtime == null ? null : uLogtime.trim();
    }
}