package com.example.bgmea;

public class Cost {
    private String typeOfCost;
    private int cost;

    public Cost(String typeOfCost, int cost) {
        this.typeOfCost = typeOfCost;
        this.cost = cost;
    }

    public String getTypeOfCost() {
        return typeOfCost;
    }

    public void setTypeOfCost(String typeOfCost) {
        this.typeOfCost = typeOfCost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Cost{" +
                "typeOfCost='" + typeOfCost + '\'' +
                ", cost=" + cost +
                '}';
    }
}
