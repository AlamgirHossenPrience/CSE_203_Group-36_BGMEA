package com.example.bgmea;

import java.io.Serializable;

public class WageComplianceReport implements Serializable {
    private int factoryCode, basicSalary, overtimePament;
    private String allowances;

    public WageComplianceReport() {
    }

    public WageComplianceReport(int factoryCode, int basicSalary, int overtimePament, String allowances) {
        this.factoryCode = factoryCode;
        this.basicSalary = basicSalary;
        this.overtimePament = overtimePament;
        this.allowances = allowances;
    }

    public int getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(int factoryCode) {
        this.factoryCode = factoryCode;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getOvertimePament() {
        return overtimePament;
    }

    public void setOvertimePament(int overtimePament) {
        this.overtimePament = overtimePament;
    }

    public String getAllowances() {
        return allowances;
    }

    public void setAllowances(String allowances) {
        this.allowances = allowances;
    }

    @Override
    public String toString() {
        return "WageComplianceReport{" +
                "factoryCode=" + factoryCode +
                ", basicSalary=" + basicSalary +
                ", overtimePament=" + overtimePament +
                ", allowances='" + allowances + '\'' +
                '}';
    }
}
