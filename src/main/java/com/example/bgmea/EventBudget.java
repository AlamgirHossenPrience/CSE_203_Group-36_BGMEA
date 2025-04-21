package com.example.bgmea;

public class EventBudget {
    private String category;
    private double projectedSubTotal;
    private String eventName;

    public EventBudget(String category, double projectedSubTotal, String eventName) {
        this.category = category;
        this.projectedSubTotal = projectedSubTotal;
        this.eventName = eventName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getProjectedSubTotal() {
        return projectedSubTotal;
    }

    public void setProjectedSubTotal(double projectedSubTotal) {
        this.projectedSubTotal = projectedSubTotal;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}