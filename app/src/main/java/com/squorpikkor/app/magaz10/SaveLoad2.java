package com.squorpikkor.app.magaz10;

//Created by Vadim on 04.06.2017.

import android.content.Context;
import android.content.SharedPreferences;

class SaveLoad2 {

    private SharedPreferences preferences;

    private void saveInteger(int i, String SET_NAME) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(SET_NAME, i);
        editor.apply();
    }

    private int loadInteger(String SET_NAME) {
        int i = 0;
        if (preferences.contains(SET_NAME)) {
            i = preferences.getInt(SET_NAME, 0);
        }
        return i;
    }

    private void saveDouble(double d, String SET_NAME) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat(SET_NAME, (float)d);
        editor.apply();
    }

    private double loadDouble(String SET_NAME) {
        double d = 0;
        if (preferences.contains(SET_NAME)) {
            d = preferences.getFloat(SET_NAME, 0);
        }
        return d;
    }


    private void saveTotalJuiceWeGot() {
        saveInteger(DataSingleton.getInstance().getTotalJuiceCount(), "totalJuiceWeGot");
    }
    private void saveTotalOrderPrice() {
        saveDouble(DataSingleton.getInstance().getTotalOrderPrice(), "totalOrderPrice");
    }
    private void saveOrdersSumma() {
        saveDouble(DataSingleton.getInstance().getOrdersSumma(), "ordersSumma");
    }
    private void saveMainTotalJuicePrice() {
        saveDouble(DataSingleton.getInstance().getMainTotalJuicePrice(), "mainTotalJuicePrice");
    }
    private void saveMainMoneyLeft() {
        saveDouble(DataSingleton.getInstance().getMainMoneyLeft(), "mainMoneyLeft");
    }
    private void saveMainMoneyLeftForeach() {
        saveDouble(DataSingleton.getInstance().getMainMoneyLeftForeach(), "mainMoneyLeftForeach");
    }
    private void saveMainJuiceWeGot() {
        saveInteger(DataSingleton.getInstance().getMainJuiceWeGot(), "mainJuiceWeGot");
    }



    private void loadTotalJuiceWeGot() {
        DataSingleton.getInstance().setMainJuiceWeGot(loadInteger("totalJuiceWeGot"));
    }
    private void loadTotalOrderPrice() {
        DataSingleton.getInstance().setTotalOrderPrice(loadDouble("totalOrderPrice"));
    }
    private void loadOrdersSumma() {
        DataSingleton.getInstance().setOrdersSumma(loadDouble("ordersSumma"));
    }
    private void loadMainTotalJuicePrice() {
        DataSingleton.getInstance().setMainTotalJuicePrice(loadDouble("mainTotalJuicePrice"));
    }
    private void loadMainMoneyLeft() {
        DataSingleton.getInstance().setMainMoneyLeft(loadDouble("mainMoneyLeft"));
    }
    private void loadMainMoneyLeftForeach() {
        DataSingleton.getInstance().setMainMoneyLeftForeach(loadDouble("mainMoneyLeftForeach"));
    }
    private void loadMainJuiceWeGot() {
        DataSingleton.getInstance().setMainJuiceWeGot(loadInteger("MainJuiceWeGot"));
    }

    void saveHomeActivity() {
        saveTotalJuiceWeGot();
        saveTotalOrderPrice();
        saveOrdersSumma();
        saveMainTotalJuicePrice();
        saveMainMoneyLeft();
        saveMainMoneyLeftForeach();
        saveMainJuiceWeGot();
    }

    void loadHomeActivity() {
        loadTotalJuiceWeGot();
        loadTotalOrderPrice();
        loadOrdersSumma();
        loadMainTotalJuicePrice();
        loadMainMoneyLeft();
        loadMainMoneyLeftForeach();
        loadMainJuiceWeGot();
    }
}
