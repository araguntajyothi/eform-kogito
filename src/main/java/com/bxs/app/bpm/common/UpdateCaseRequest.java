package com.bxs.app.bpm.common;

public class UpdateCaseRequest {
    private String statusId;
    private int levelId;
    private String submitterId;

    public UpdateCaseRequest() {
    }

    public UpdateCaseRequest(String statusId, int levelId, String submitterId) {
        this.statusId = statusId;
        this.levelId = levelId;
        this.submitterId = submitterId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public String getSubmitterId() {
        return submitterId;
    }

    public void setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
    }

    @Override
    public String toString() {
        return "UpdateCaseRequest{" +
                "statusId='" + statusId + '\'' +
                ", levelId=" + levelId +
                ", submitterId='" + submitterId + '\'' +
                '}';
    }
}
