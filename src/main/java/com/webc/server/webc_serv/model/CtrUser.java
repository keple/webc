package com.webc.server.webc_serv.model;

import java.util.Date;

public class CtrUser{
    private int userNo;
    private String userTelNo;
    private boolean isPaid;
    private int billNo;
    private int reciptNo;
    private Date requestTime;

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserTelNo() {
        return userTelNo;
    }

    public void setUserTelNo(String userTelNo) {
        this.userTelNo = userTelNo;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public int getReciptNo() {
        return reciptNo;
    }

    public void setReciptNo(int reciptNo) {
        this.reciptNo = reciptNo;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    @Override
    public String toString() {
        return "CtrUser [billNo=" + billNo + ", isPaid=" + isPaid + ", reciptNo=" + reciptNo + ", requestTime="
                + requestTime + ", userNo=" + userNo + ", userTelNo=" + userTelNo + "]";
    }
}