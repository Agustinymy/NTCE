package com.edu.entity;

public class StudentCourse {

    private Long sId;
    private Long cId;
    private String scScore;

    public StudentCourse() {
    }

    public StudentCourse(Long sId, Long cId, String scScore) {
        this.sId = sId;
        this.cId = cId;
        this.scScore = scScore;
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

    public String getScScore() {
        return scScore;
    }

    public void setScScore(String scScore) {
        this.scScore = scScore;
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
                "sId=" + sId +
                ", cId=" + cId +
                ", scScore='" + scScore + '\'' +
                '}';
    }
}
