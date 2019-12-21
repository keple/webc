package com.webc.server.webc_serv.model;

public class CenterVO{
    private int ctrNo;
    private String ctrNm;
    private String ctrAddr;
    private String ctrTelNo;
    private boolean isContracted;

    public int getCtrNo() {
        return ctrNo;
    }

    public void setCtrNo(int ctrNo) {
        this.ctrNo = ctrNo;
    }

    public String getCtrNm() {
        return ctrNm;
    }

    public void setCtrNm(String ctrNm) {
        this.ctrNm = ctrNm;
    }

    public String getCtrAddr() {
        return ctrAddr;
    }

    public void setCtrAddr(String ctrAddr) {
        this.ctrAddr = ctrAddr;
    }

    public String getCtrTelNo() {
        return ctrTelNo;
    }

    public void setCtrTelNo(String ctrTelNo) {
        this.ctrTelNo = ctrTelNo;
    }

    public boolean isContracted() {
        return isContracted;
    }

    public void setContracted(boolean isContracted) {
        this.isContracted = isContracted;
    }

    @Override
    public String toString() {
        return "CenterVO [ctrAddr=" + ctrAddr + ", ctrNm=" + ctrNm + ", ctrNo=" + ctrNo + ", ctrTelNo=" + ctrTelNo
                + ", isContracted=" + isContracted + "]";
    }
}