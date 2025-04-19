package com.example.bgmea;

import java.time.LocalDate;

public class ComplianceViolationNotice {
    private int factoryCode;
    private String violationType, description;
    private LocalDate noticeDate;

    public ComplianceViolationNotice() {
    }

    public ComplianceViolationNotice(int factoryCode, String violationType, String description, LocalDate noticeDate) {
        this.factoryCode = factoryCode;
        this.violationType = violationType;
        this.description = description;
        this.noticeDate = noticeDate;
    }

    public int getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(int factoryCode) {
        this.factoryCode = factoryCode;
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
                "factoryCode=" + factoryCode +
                ", violationType='" + violationType + '\'' +
                ", description='" + description + '\'' +
                ", noticeDate=" + noticeDate +
                '}';
    }
}
