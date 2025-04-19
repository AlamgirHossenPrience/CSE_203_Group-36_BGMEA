package com.example.bgmea;

public class CompletedProgram {
    private int programID;
    private String review;

    public CompletedProgram() {
    }

    public CompletedProgram(int programID, String review) {
        this.programID = programID;
        this.review = review;
    }

    public int getProgramID() {
        return programID;
    }

    public void setProgramID(int programID) {
        this.programID = programID;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "CompletedProgram{" +
                "programID=" + programID +
                ", review='" + review + '\'' +
                '}';
    }
}
