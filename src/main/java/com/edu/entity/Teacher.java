package com.edu.entity;

import java.math.BigDecimal;

public class Teacher {

    private Long tId;
    private String tNo;
    private String tPwd;
    private String tName;
    private String tSex;
    private String tAddress;
    private String tTel;
    private BigDecimal tAccount;

    public Teacher() {
    }

    public Teacher(Long tId, String tNo, String tPwd, String tName, String tSex, String tAddress, String tTel, BigDecimal tAccount) {
        this.tId = tId;
        this.tNo = tNo;
        this.tPwd = tPwd;
        this.tName = tName;
        this.tSex = tSex;
        this.tAddress = tAddress;
        this.tTel = tTel;
        this.tAccount = tAccount;
    }

    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
        this.tId = tId;
    }

    public String gettNo() {
        return tNo;
    }

    public void settNo(String tNo) {
        this.tNo = tNo;
    }

    public String gettPwd() {
        return tPwd;
    }

    public void settPwd(String tPwd) {
        this.tPwd = tPwd;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    public String gettTel() {
        return tTel;
    }

    public void settTel(String tTel) {
        this.tTel = tTel;
    }

    public BigDecimal gettAccount() {
        return tAccount;
    }

    public void settAccount(BigDecimal tAccount) {
        this.tAccount = tAccount;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", tNo='" + tNo + '\'' +
                ", tPwd='" + tPwd + '\'' +
                ", tName='" + tName + '\'' +
                ", tSex='" + tSex + '\'' +
                ", tAddress='" + tAddress + '\'' +
                ", tTel='" + tTel + '\'' +
                ", tAccount=" + tAccount +
                '}';
    }
}
