package com.webc.server.webc_serv.model;

import java.util.Date;

public class UserBill{
    private int billNo;
    private int billMoney;
    private Date billOccurTime;

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public int getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(int billMoney) {
        this.billMoney = billMoney;
    }

    public Date getBillOccurTime() {
        return billOccurTime;
    }

    public void setBillOccurTime(Date billOccurTime) {
        this.billOccurTime = billOccurTime;
    }

    @Override
    public String toString() {
        return "UserBill [billMoney=" + billMoney + ", billNo=" + billNo + ", billOccurTime=" + billOccurTime + "]";
    }
}