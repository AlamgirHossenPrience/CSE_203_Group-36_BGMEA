package com.example.bgmea;

import java.io.Serializable;

public class Trainer implements Serializable {
    private int trainerID;
    private String trainerName, email, phnNo;

    public Trainer() {
    }

    public Trainer(int trainerID, String trainerName, String email, String phnNo) {
        this.trainerID = trainerID;
        this.trainerName = trainerName;
        this.email = email;
        this.phnNo = phnNo;
    }

    public int getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(int trainerID) {
        this.trainerID = trainerID;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerID=" + trainerID +
                ", trainerName='" + trainerName + '\'' +
                ", email='" + email + '\'' +
                ", phnNo='" + phnNo + '\'' +
                '}';
    }
}
