package com.webc.server.webc_serv.model;

import java.util.Date;

public class UserRecipt{
    private int reciptNo;
    private Date reciptOccurTime;
    private int paidMoney;
    private Date payDate;

    public int getReciptNo() {
        return reciptNo;
    }

    public void setReciptNo(int reciptNo) {
        this.reciptNo = reciptNo;
    }

    public Date getReciptOccurTime() {
        return reciptOccurTime;
    }

    public void setReciptOccurTime(Date reciptOccurTime) {
        this.reciptOccurTime = reciptOccurTime;
    }

    public int getPaidMoney() {
        return paidMoney;
    }

    public void setPaidMoney(int paidMoney) {
        this.paidMoney = paidMoney;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    @Override
    public String toString() {
        return "UserRecipt [paidMoney=" + paidMoney + ", payDate=" + payDate + ", reciptNo=" + reciptNo
                + ", reciptOccurTime=" + reciptOccurTime + "]";
    }
    

}