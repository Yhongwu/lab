package com.sys.entity;

public class Joins {
    private Integer jId;

    private String jCom;

    private String jContent;

    private String jTime;

    private Integer status;

    private Integer jPo;

    public Integer getjId() {
        return jId;
    }

    public void setjId(Integer jId) {
        this.jId = jId;
    }

    public String getjCom() {
        return jCom;
    }

    public void setjCom(String jCom) {
        this.jCom = jCom == null ? null : jCom.trim();
    }

    public String getjContent() {
        return jContent;
    }

    public void setjContent(String jContent) {
        this.jContent = jContent == null ? null : jContent.trim();
    }

    public String getjTime() {
        return jTime;
    }

    public void setjTime(String jTime) {
        this.jTime = jTime == null ? null : jTime.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getjPo() {
        return jPo;
    }

    public void setjPo(Integer jPo) {
        this.jPo = jPo;
    }
}