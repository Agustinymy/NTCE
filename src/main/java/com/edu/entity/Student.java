package com.edu.entity;

import java.math.BigDecimal;

public class Student {

    private Long sId;
    private String sNo;
    private String sPwd;
    private String sName;
    private String sSex;
    private String sAddress;
    private String sTel;
    private BigDecimal sAccount;
    private Integer sStatus;

    public Student() {
    }

    public Student(Long sId, String sNo, String sPwd, String sName, String sSex, String sAddress, String sTel, BigDecimal sAccount, Integer sStatus) {
        this.sId = sId;
        this.sNo = sNo;
        this.sPwd = sPwd;
        this.sName = sName;
        this.sSex = sSex;
        this.sAddress = sAddress;
        this.sTel = sTel;
        this.sAccount = sAccount;
        this.sStatus = sStatus;
    }

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getsPwd() {
        return sPwd;
    }

    public void setsPwd(String sPwd) {
        this.sPwd = sPwd;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsTel() {
        return sTel;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel;
    }

    public BigDecimal getsAccount() {
        return sAccount;
    }

    public void setsAccount(BigDecimal sAccount) {
        this.sAccount = sAccount;
    }

    public Integer getsStatus() {
        return sStatus;
    }

    public void setsStatus(Integer sStatus) {
        this.sStatus = sStatus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sNo='" + sNo + '\'' +
                ", sPwd='" + sPwd + '\'' +
                ", sName='" + sName + '\'' +
                ", sSex='" + sSex + '\'' +
                ", sAddress='" + sAddress + '\'' +
                ", sTel='" + sTel + '\'' +
                ", sAccount=" + sAccount +
                ", sStatus=" + sStatus +
                '}';
    }
}
