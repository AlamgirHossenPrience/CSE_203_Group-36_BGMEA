package com.example.bgmea;

public class Sponsor {
    private String sponsoringCompany;
    private String advertisingProduct;
    private String sponsorshipID;
    private String approvalStatus;

    public Sponsor(String sponsoringCompany, String advertisingProduct, String sponsorshipID, String approvalStatus) {
        this.sponsoringCompany = sponsoringCompany;
        this.advertisingProduct = advertisingProduct;
        this.sponsorshipID = sponsorshipID;
        this.approvalStatus = approvalStatus;
    }

    public String getSponsoringCompany() {
        return sponsoringCompany;
    }

    public void setSponsoringCompany(String sponsoringCompany) {
        this.sponsoringCompany = sponsoringCompany;
    }

    public String getAdvertisingProduct() {
        return advertisingProduct;
    }

    public void setAdvertisingProduct(String advertisingProduct) {
        this.advertisingProduct = advertisingProduct;
    }

    public String getSponsorshipID() {
        return sponsorshipID;
    }

    public void setSponsorshipID(String sponsorshipID) {
        this.sponsorshipID = sponsorshipID;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }
}