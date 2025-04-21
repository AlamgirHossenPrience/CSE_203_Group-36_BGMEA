package com.example.bgmea;

public class FactoryModel {
    private String factoryName;
    private int monthlyExports;
    private int quarterlyExports;
    private int yearlyExports;
    private double productionRate;
    private String activeStatus;

    // Constructor, getters, and setters
    public FactoryModel(String factoryName, int monthlyExports, int quarterlyExports,
                   int yearlyExports, double productionRate, String activeStatus) {
        this.factoryName = factoryName;
        this.monthlyExports = monthlyExports;
        this.quarterlyExports = quarterlyExports;
        this.yearlyExports = yearlyExports;
        this.productionRate = productionRate;
        this.activeStatus = activeStatus;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public int getMonthlyExports() {
        return monthlyExports;
    }

    public void setMonthlyExports(int monthlyExports) {
        this.monthlyExports = monthlyExports;
    }

    public int getQuarterlyExports() {
        return quarterlyExports;
    }

    public void setQuarterlyExports(int quarterlyExports) {
        this.quarterlyExports = quarterlyExports;
    }

    public int getYearlyExports() {
        return yearlyExports;
    }

    public void setYearlyExports(int yearlyExports) {
        this.yearlyExports = yearlyExports;
    }

    public double getProductionRate() {
        return productionRate;
    }

    public void setProductionRate(double productionRate) {
        this.productionRate = productionRate;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

}