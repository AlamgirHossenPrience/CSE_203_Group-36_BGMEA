package com.example.bgmea;

import java.time.LocalDate;
import java.util.ArrayList;

public class TrainingProgram {
    private int programID;
    private String programTitle, mode, description;
    private float duration;

    private int trainerID;

    private LocalDate date;
    private String time, venue;

    private ArrayList<Worker> workerlist;

    public TrainingProgram() {
    }

    public TrainingProgram(int programID, String programTitle, String mode, String description, float duration) {
        this.programID = programID;
        this.programTitle = programTitle;
        this.mode = mode;
        this.description = description;
        this.duration = duration;
    }

    public TrainingProgram(int programID, String programTitle, String mode, String description, float duration, int trainerID, LocalDate date, String time, String venue, ArrayList<Worker> workerlist) {
        this.programID = programID;
        this.programTitle = programTitle;
        this.mode = mode;
        this.description = description;
        this.duration = duration;
        this.trainerID = trainerID;
        this.date = date;
        this.time = time;
        this.venue = venue;
        this.workerlist = workerlist;
    }

    public int getProgramID() {
        return programID;
    }

    public void setProgramID(int programID) {
        this.programID = programID;
    }

    public String getProgramTitle() {
        return programTitle;
    }

    public void setProgramTitle(String programTitle) {
        this.programTitle = programTitle;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public int getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(int trainerID) {
        this.trainerID = trainerID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public ArrayList<Worker> getWorkerlist() {
        return workerlist;
    }

    public void setWorkerlist(ArrayList<Worker> workerlist) {
        this.workerlist = workerlist;
    }

    @Override
    public String toString() {
        return "TrainingProgram{" +
                "programID=" + programID +
                ", programTitle='" + programTitle + '\'' +
                ", mode='" + mode + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", trainerID=" + trainerID +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", venue='" + venue + '\'' +
                ", workerlist=" + workerlist +
                '}';
    }
}
