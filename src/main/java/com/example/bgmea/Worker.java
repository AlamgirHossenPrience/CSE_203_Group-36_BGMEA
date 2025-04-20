package com.example.bgmea;

import java.io.Serializable;
import java.time.LocalDate;

public class Worker implements Serializable {
    private int workerID;
    private String workerName, phnNo, gender;
    private LocalDate dob;

    public Worker() {
    }

    public Worker(int workerID, String workerName, String phnNo, String gender, LocalDate dob) {
        this.workerID = workerID;
        this.workerName = workerName;
        this.phnNo = phnNo;
        this.gender = gender;
        this.dob = dob;
    }

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerID=" + workerID +
                ", workerName='" + workerName + '\'' +
                ", phnNo='" + phnNo + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                '}';
    }
}
