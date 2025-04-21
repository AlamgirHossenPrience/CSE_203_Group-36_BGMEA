package com.example.bgmea;

public class Guest {
    private String guestName;
    private String guestType; // VIP or Normal
    private String company;
    private String phoneNumber;
    private String emailAddress;
    private boolean isChiefGuest;

    public Guest(String guestName, String guestType, String company, String phoneNumber, String emailAddress, boolean isChiefGuest) {
        this.guestName = guestName;
        this.guestType = guestType;
        this.company = company;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.isChiefGuest = isChiefGuest;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isChiefGuest() {
        return isChiefGuest;
    }

    public void setChiefGuest(boolean chiefGuest) {
        isChiefGuest = chiefGuest;
    }
}