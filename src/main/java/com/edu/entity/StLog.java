package com.edu.entity;

import java.util.Date;

public class StLog {

    private Long stId;
    private String stType;
    private Long stTableId;
    private String stTableComment;
    private Date stDatetime;

    public StLog() {
    }

    public StLog(Long stId, String stType, Long stTableId, String stTableComment, Date stDatetime) {
        this.stId = stId;
        this.stType = stType;
        this.stTableId = stTableId;
        this.stTableComment = stTableComment;
        this.stDatetime = stDatetime;
    }

    public Long getStId() {
        return stId;
    }

    public void setStId(Long stId) {
        this.stId = stId;
    }

    public String getStType() {
        return stType;
    }

    public void setStType(String stType) {
        this.stType = stType;
    }

    public Long getStTableId() {
        return stTableId;
    }

    public void setStTableId(Long stTableId) {
        this.stTableId = stTableId;
    }

    public String getStTableComment() {
        return stTableComment;
    }

    public void setStTableComment(String stTableComment) {
        this.stTableComment = stTableComment;
    }

    public Date getStDatetime() {
        return stDatetime;
    }

    public void setStDatetime(Date stDatetime) {
        this.stDatetime = stDatetime;
    }

    @Override
    public String toString() {
        return "StLog{" +
                "stId=" + stId +
                ", stType='" + stType + '\'' +
                ", stTableId=" + stTableId +
                ", stTableComment='" + stTableComment + '\'' +
                ", stDatetime=" + stDatetime +
                '}';
    }
}
