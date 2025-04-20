package com.example.bgmea;

import java.io.Serializable;

public class WageComplianceReport implements Serializable {
    private int  basicSalary, overtimePament;
    private String factoryName, allowances;

    public WageComplianceReport() {
    }

    public WageComplianceReport(String factoryName, int basicSalary, int overtimePament, String allowances) {
        this.factoryName = factoryName;
        this.basicSalary = basicSalary;
        this.overtimePament = overtimePament;
        this.allowances = allowances;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
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
                "basicSalary=" + basicSalary +
                ", overtimePament=" + overtimePament +
                ", factoryName='" + factoryName + '\'' +
                ", allowances='" + allowances + '\'' +
                '}';
    }
}
