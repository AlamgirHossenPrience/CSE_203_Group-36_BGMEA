package com.example.bgmea;

public class AppliedMember {
    private String factoryName;
    private String applicationID;
    private String verificationStatus;
    private String acceptanceStatus;

    // Constructor, getters, and setters
    public AppliedMember(String factoryName, String applicationID, String verificationStatus, String acceptanceStatus) {
        this.factoryName = factoryName;
        this.applicationID = applicationID;
        this.verificationStatus = verificationStatus;
        this.acceptanceStatus = acceptanceStatus;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getAcceptanceStatus() {
        return acceptanceStatus;
    }

    public void setAcceptanceStatus(String acceptanceStatus) {
        this.acceptanceStatus = acceptanceStatus;
    }
}