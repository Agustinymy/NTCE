package com.edu.entity;

public class StLogComment {

    private Long stLogId;
    private Long stId;
    private String stColumn;
    private String stColumnComment;
    private String stColumnValue;
    private String stCurrentValue;

    public StLogComment() {
    }

    public StLogComment(Long stLogId, Long stId, String stColumn, String stColumnComment, String stColumnValue, String stCurrentValue) {
        this.stLogId = stLogId;
        this.stId = stId;
        this.stColumn = stColumn;
        this.stColumnComment = stColumnComment;
        this.stColumnValue = stColumnValue;
        this.stCurrentValue = stCurrentValue;
    }

    public Long getStLogId() {
        return stLogId;
    }

    public void setStLogId(Long stLogId) {
        this.stLogId = stLogId;
    }

    public Long getStId() {
        return stId;
    }

    public void setStId(Long stId) {
        this.stId = stId;
    }

    public String getStColumn() {
        return stColumn;
    }

    public void setStColumn(String stColumn) {
        this.stColumn = stColumn;
    }

    public String getStColumnComment() {
        return stColumnComment;
    }

    public void setStColumnComment(String stColumnComment) {
        this.stColumnComment = stColumnComment;
    }

    public String getStColumnValue() {
        return stColumnValue;
    }

    public void setStColumnValue(String stColumnValue) {
        this.stColumnValue = stColumnValue;
    }

    public String getStCurrentValue() {
        return stCurrentValue;
    }

    public void setStCurrentValue(String stCurrentValue) {
        this.stCurrentValue = stCurrentValue;
    }

    @Override
    public String toString() {
        return "StLogComment{" +
                "stLogId=" + stLogId +
                ", stId=" + stId +
                ", stColumn='" + stColumn + '\'' +
                ", stColumnComment='" + stColumnComment + '\'' +
                ", stColumnValue='" + stColumnValue + '\'' +
                ", stCurrentValue='" + stCurrentValue + '\'' +
                '}';
    }
}
