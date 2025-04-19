package com.example.bgmea;

import java.time.LocalDate;

public class BlacklistedFactory {
    private int factoryCode, panaltyAmount;
    private String blacklistedBy, violation, reason;
    private LocalDate blacklistedDate;

    public BlacklistedFactory() {
    }

    public BlacklistedFactory(int factoryCode, int panaltyAmount, String blacklistedBy, String violation, String reason, LocalDate blacklistedDate) {
        this.factoryCode = factoryCode;
        this.panaltyAmount = panaltyAmount;
        this.blacklistedBy = blacklistedBy;
        this.violation = violation;
        this.reason = reason;
        this.blacklistedDate = blacklistedDate;
    }

    public int getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(int factoryCode) {
        this.factoryCode = factoryCode;
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
                "factoryCode=" + factoryCode +
                ", panaltyAmount=" + panaltyAmount +
                ", blacklistedBy='" + blacklistedBy + '\'' +
                ", violation='" + violation + '\'' +
                ", reason='" + reason + '\'' +
                ", blacklistedDate=" + blacklistedDate +
                '}';
    }
}
