package com.sys.entity;

public class HomeShow {
    private Integer sid;

    private String surl;

    private String stitle;

    private String scontent;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSurl() {
        return surl;
    }

    public void setSurl(String surl) {
        this.surl = surl == null ? null : surl.trim();
    }

    public String getStitle() {
        return stitle;
    }

    public void setStitle(String stitle) {
        this.stitle = stitle == null ? null : stitle.trim();
    }

    public String getScontent() {
        return scontent;
    }

    public void setScontent(String scontent) {
        this.scontent = scontent == null ? null : scontent.trim();
    }
}