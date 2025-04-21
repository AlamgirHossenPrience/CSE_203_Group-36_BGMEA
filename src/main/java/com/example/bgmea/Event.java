package com.example.bgmea;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event {
    private String eventName;
    private String eventDescription;
    private String eventType;
    private String eventVenue;
    private LocalDate eventDate;
    private LocalTime eventTime;
    private String approvalStatus;

    public Event(String eventName, String eventDescription, String eventType, LocalDate eventDate, String eventVenue, LocalTime eventTime, String approvalStatus) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.eventVenue = eventVenue;
        this.eventTime = eventTime;
        this.approvalStatus = approvalStatus;
    }

    public Event(String name, String description, String type, String venue, String date, String time, String approvalStatus) {
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public LocalTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalTime eventTime) {
        this.eventTime = eventTime;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }
}