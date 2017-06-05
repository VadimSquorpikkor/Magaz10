package com.squorpikkor.app.magaz10;

// Created by Vadim on 03.06.2017.

public class DataSingleton {

    private DataSingleton() {}

    private static class SingletoneHelper {
        private static final DataSingleton INSTANCE = new DataSingleton();
    }
    public static DataSingleton getInstance() {
        return SingletoneHelper.INSTANCE;
    }



    /*Home variables*/
    private int totalJuiceCount;
    private double totalOrderPrice;
    private double ordersSumma;
    private double mainTotalJuicePrice;
    private double mainMoneyLeft;
    private double mainMoneyLeftForeach;
    private int mainJuiceWeGot;

//    double mainMoneyLeft = totalOrderPrice - mainTotalJuicePrice - ordersSumma;
//    double mainMoneyLeftForeach = mainMoneyLeft/2;

    //region GETTERS SETTERS
    public int getTotalJuiceCount() {
        return totalJuiceCount;
    }

    public void setTotalJuiceCount(int totalJuiceCount) {
        this.totalJuiceCount = totalJuiceCount;
    }

    public double getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public void setTotalOrderPrice(double totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }

    public double getOrdersSumma() {
        return ordersSumma;
    }

    public void setOrdersSumma(double ordersSumma) {
        this.ordersSumma = ordersSumma;
    }

    public double getMainTotalJuicePrice() {
        return mainTotalJuicePrice;
    }

    public void setMainTotalJuicePrice(double mainTotalJuicePrice) {
        this.mainTotalJuicePrice = mainTotalJuicePrice;
    }

    public double getMainMoneyLeft() {
        return mainMoneyLeft;
    }

    public void setMainMoneyLeft(double mainMoneyLeft) {
        this.mainMoneyLeft = mainMoneyLeft;
    }

    public double getMainMoneyLeftForeach() {
        return mainMoneyLeftForeach;
    }

    public void setMainMoneyLeftForeach(double mainMoneyLeftForeach) {
        this.mainMoneyLeftForeach = mainMoneyLeftForeach;
    }

    public int getMainJuiceWeGot() {
        return mainJuiceWeGot;
    }

    public void setMainJuiceWeGot(int mainJuiceWeGot) {
        this.mainJuiceWeGot = mainJuiceWeGot;
    }
    //endregion


}
