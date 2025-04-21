package com.example.bgmea;

import java.time.LocalDate;

public class ComplianceViolationNotice {
    private String factoryName;
    private String violationType, description;
    private LocalDate noticeDate;

    public ComplianceViolationNotice() {
    }

    public ComplianceViolationNotice(String factoryName, String violationType, String description, LocalDate noticeDate) {
        this.factoryName = factoryName;
        this.violationType = violationType;
        this.description = description;
        this.noticeDate = noticeDate;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getViolationType() {
        return violationType;
    }

    public void setViolationType(String violationType) {
        this.violationType = violationType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(LocalDate noticeDate) {
        this.noticeDate = noticeDate;
    }

    @Override
    public String toString() {
        return "ComplianceViolationNotice{" +
                "factoryName='" + factoryName + '\'' +
                ", violationType='" + violationType + '\'' +
                ", description='" + description + '\'' +
                ", noticeDate=" + noticeDate +
                '}';
    }
}
