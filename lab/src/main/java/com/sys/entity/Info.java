package com.sys.entity;

public class Info {
    private Integer iId;

    private String iTel;

    private String iEmail;

    private String iAddr;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public String getiTel() {
        return iTel;
    }

    public void setiTel(String iTel) {
        this.iTel = iTel == null ? null : iTel.trim();
    }

    public String getiEmail() {
        return iEmail;
    }

    public void setiEmail(String iEmail) {
        this.iEmail = iEmail == null ? null : iEmail.trim();
    }

    public String getiAddr() {
        return iAddr;
    }

    public void setiAddr(String iAddr) {
        this.iAddr = iAddr == null ? null : iAddr.trim();
    }
}