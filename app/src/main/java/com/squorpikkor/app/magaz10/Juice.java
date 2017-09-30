package com.squorpikkor.app.magaz10;

/**
 * Created by VadimSquorpikkor on 02.09.2017.
 *
 */

public class Juice {
    private String name;
    private double cost = 0;
    private int count = 0;

    double totalPrice() {
        return cost * (double)count;
    }

    /**SETTERS & GETTERS*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
