package com.edu.entity;

public class Order {

    private Long oId;
    private Long sId;
    private Long cId;
    private Integer oStatus;

    public Order() {
    }

    public Order(Long oId, Long sId, Long cId, Integer oStatus) {
        this.oId = oId;
        this.sId = sId;
        this.cId = cId;
        this.oStatus = oStatus;
    }

    public Long getoId() {
        return oId;
    }

    public void setoId(Long oId) {
        this.oId = oId;
    }

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public Integer getoStatus() {
        return oStatus;
    }

    public void setoStatus(Integer oStatus) {
        this.oStatus = oStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oId=" + oId +
                ", sId=" + sId +
                ", cId=" + cId +
                ", oStatus=" + oStatus +
                '}';
    }
}
