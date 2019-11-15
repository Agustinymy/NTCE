package com.edu.entity;

import java.math.BigDecimal;

public class Course {

    private Long cId;
    private String cName;
    private Long cTotal;
    private Long cSelected;
    private BigDecimal cPrice;
    private Long tId;

    public Course() {
    }

    public Course(Long cId, String cName, Long cTotal, Long cSelected, BigDecimal cPrice, Long tId) {
        this.cId = cId;
        this.cName = cName;
        this.cTotal = cTotal;
        this.cSelected = cSelected;
        this.cPrice = cPrice;
        this.tId = tId;
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Long getcTotal() {
        return cTotal;
    }

    public void setcTotal(Long cTotal) {
        this.cTotal = cTotal;
    }

    public Long getcSelected() {
        return cSelected;
    }

    public void setcSelected(Long cSelected) {
        this.cSelected = cSelected;
    }

    public BigDecimal getcPrice() {
        return cPrice;
    }

    public void setcPrice(BigDecimal cPrice) {
        this.cPrice = cPrice;
    }

    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
        this.tId = tId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cTotal=" + cTotal +
                ", cSelected=" + cSelected +
                ", cPrice=" + cPrice +
                ", tId=" + tId +
                '}';
    }
}
