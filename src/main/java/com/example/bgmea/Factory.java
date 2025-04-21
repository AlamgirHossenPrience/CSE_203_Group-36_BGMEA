package com.example.bgmea;

import java.io.Serializable;

public class Factory implements Serializable {
    private int factoryCode, noOfWorkers;
    private String factoryName, owner,contactNo;

    public Factory() {
    }

    public Factory(int factoryCode, int noOfWorkers, String factoryName, String owner, String contactNo) {
        this.factoryCode = factoryCode;
        this.noOfWorkers = noOfWorkers;
        this.factoryName = factoryName;
        this.owner = owner;
        this.contactNo = contactNo;
    }

    public int getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(int factoryCode) {
        this.factoryCode = factoryCode;
    }

    public int getNoOfWorkers() {
        return noOfWorkers;
    }

    public void setNoOfWorkers(int noOfWorkers) {
        this.noOfWorkers = noOfWorkers;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryCode=" + factoryCode +
                ", noOfWorkers=" + noOfWorkers +
                ", factoryName='" + factoryName + '\'' +
                ", owner='" + owner + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }


}
