package com.example.bgmea;

import java.io.Serializable;

public class SafetyAudit implements Serializable {
    private int factoryCode;
    private String fireSafety, electricalSafety, structuralIntegrity, emergencyResponse, protectiveEquipment;

    public SafetyAudit() {
    }

    public SafetyAudit(int factoryCode, String fireSafety, String electricalSafety, String structuralIntegrity, String emergencyResponse, String protectiveEquipment) {
        this.factoryCode = factoryCode;
        this.fireSafety = fireSafety;
        this.electricalSafety = electricalSafety;
        this.structuralIntegrity = structuralIntegrity;
        this.emergencyResponse = emergencyResponse;
        this.protectiveEquipment = protectiveEquipment;
    }

    public int getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(int factoryCode) {
        this.factoryCode = factoryCode;
    }

    public String getFireSafety() {
        return fireSafety;
    }

    public void setFireSafety(String fireSafety) {
        this.fireSafety = fireSafety;
    }

    public String getElectricalSafety() {
        return electricalSafety;
    }

    public void setElectricalSafety(String electricalSafety) {
        this.electricalSafety = electricalSafety;
    }

    public String getStructuralIntegrity() {
        return structuralIntegrity;
    }

    public void setStructuralIntegrity(String structuralIntegrity) {
        this.structuralIntegrity = structuralIntegrity;
    }

    public String getEmergencyResponse() {
        return emergencyResponse;
    }

    public void setEmergencyResponse(String emergencyResponse) {
        this.emergencyResponse = emergencyResponse;
    }

    public String getProtectiveEquipment() {
        return protectiveEquipment;
    }

    public void setProtectiveEquipment(String protectiveEquipment) {
        this.protectiveEquipment = protectiveEquipment;
    }

    @Override
    public String toString() {
        return "SafetyAudit{" +
                "factoryCode=" + factoryCode +
                ", fireSafety='" + fireSafety + '\'' +
                ", electricalSafety='" + electricalSafety + '\'' +
                ", structuralIntegrity='" + structuralIntegrity + '\'' +
                ", emergencyResponse='" + emergencyResponse + '\'' +
                ", protectiveEquipment='" + protectiveEquipment + '\'' +
                '}';
    }
}
