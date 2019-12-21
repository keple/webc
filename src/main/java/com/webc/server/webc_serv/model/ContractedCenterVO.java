package com.webc.server.webc_serv.model;

import java.util.Date;

public class ContractedCenterVO {
    private int contractedNo;
    private String contractedCtrNo;
    private Date contractTime;
    private Date contractEndTime;

    public int getContractedNo() {
        return contractedNo;
    }

    public void setContractedNo(int contractedNo) {
        this.contractedNo = contractedNo;
    }

    public String getContractedCtrNo() {
        return contractedCtrNo;
    }

    public void setContractedCtrNo(String contractedCtrNo) {
        this.contractedCtrNo = contractedCtrNo;
    }

    public Date getContractTime() {
        return contractTime;
    }

    public void setContractTime(Date contractTime) {
        this.contractTime = contractTime;
    }

    public Date getContractEndTime() {
        return contractEndTime;
    }

    public void setContractEndTime(Date contractEndTime) {
        this.contractEndTime = contractEndTime;
    }

    @Override
    public String toString() {
        return "ContractedCenterVO [contractEndTime=" + contractEndTime + ", contractTime=" + contractTime
                + ", contractedCtrNo=" + contractedCtrNo + ", contractedNo=" + contractedNo + "]";
    }
}