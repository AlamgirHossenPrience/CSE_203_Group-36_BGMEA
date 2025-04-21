package com.example.bgmea;

import java.io.Serializable;
import java.time.LocalDate;

public class Announcement implements Serializable {
    private String title, message;
    private LocalDate date;

    public Announcement() {
    }

    public Announcement(String title, String message, LocalDate date) {
        this.title = title;
        this.message = message;
        this.date = date;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }


}
