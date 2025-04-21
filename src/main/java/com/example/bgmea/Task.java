package com.example.bgmea;

public class Task {
    private String teamName;
    private int applicableNumberOfGuests;
    private String availability;
    private String eventName;
    private String eventDate;

    // Constructor, getters, and setters
    public Task(String teamName, int applicableNumberOfGuests,
                String availability, String eventName, String eventDate) {
        this.teamName = teamName;
        this.applicableNumberOfGuests = applicableNumberOfGuests;
        this.availability = availability;
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getApplicableNumberOfGuests() {
        return applicableNumberOfGuests;
    }

    public void setApplicableNumberOfGuests(int applicableNumberOfGuests) {
        this.applicableNumberOfGuests = applicableNumberOfGuests;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }
}