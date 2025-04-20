package com.example.bgmea;

import java.io.Serializable;

public class SafetyAudit implements Serializable {
    private String factoryName;
    private String fireSafety, electricalSafety, structuralIntegrity, emergencyResponse, protectiveEquipment;

    public SafetyAudit() {
    }

    public SafetyAudit(String factoryName, String fireSafety, String electricalSafety, String structuralIntegrity, String emergencyResponse, String protectiveEquipment) {
        this.factoryName = factoryName;
        this.fireSafety = fireSafety;
        this.electricalSafety = electricalSafety;
        this.structuralIntegrity = structuralIntegrity;
        this.emergencyResponse = emergencyResponse;
        this.protectiveEquipment = protectiveEquipment;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
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
                "factoryName='" + factoryName + '\'' +
                ", fireSafety='" + fireSafety + '\'' +
                ", electricalSafety='" + electricalSafety + '\'' +
                ", structuralIntegrity='" + structuralIntegrity + '\'' +
                ", emergencyResponse='" + emergencyResponse + '\'' +
                ", protectiveEquipment='" + protectiveEquipment + '\'' +
                '}';
    }
}
