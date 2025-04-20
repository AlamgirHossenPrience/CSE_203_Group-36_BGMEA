package com.example.bgmea;

import java.io.Serializable;
import java.time.LocalDate;

public class BlacklistedFactory implements Serializable {
    private int panaltyAmount;
    private String factoryName, blacklistedBy, violation, reason;
    private LocalDate blacklistedDate;

    public BlacklistedFactory() {
    }

    public BlacklistedFactory(String factoryName, int panaltyAmount, String blacklistedBy, String violation, String reason, LocalDate blacklistedDate) {
        this.factoryName = factoryName;
        this.panaltyAmount = panaltyAmount;
        this.blacklistedBy = blacklistedBy;
        this.violation = violation;
        this.reason = reason;
        this.blacklistedDate = blacklistedDate;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public int getPanaltyAmount() {
        return panaltyAmount;
    }

    public void setPanaltyAmount(int panaltyAmount) {
        this.panaltyAmount = panaltyAmount;
    }

    public String getBlacklistedBy() {
        return blacklistedBy;
    }

    public void setBlacklistedBy(String blacklistedBy) {
        this.blacklistedBy = blacklistedBy;
    }

    public String getViolation() {
        return violation;
    }

    public void setViolation(String violation) {
        this.violation = violation;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getBlacklistedDate() {
        return blacklistedDate;
    }

    public void setBlacklistedDate(LocalDate blacklistedDate) {
        this.blacklistedDate = blacklistedDate;
    }

    @Override
    public String toString() {
        return "BlacklistedFactory{" +
                "panaltyAmount=" + panaltyAmount +
                ", factoryName='" + factoryName + '\'' +
                ", blacklistedBy='" + blacklistedBy + '\'' +
                ", violation='" + violation + '\'' +
                ", reason='" + reason + '\'' +
                ", blacklistedDate=" + blacklistedDate +
                '}';
    }
}
