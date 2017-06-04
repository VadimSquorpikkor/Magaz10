package com.squorpikkor.app.magaz10;

//Created by Vadim on 04.06.2017.

import android.content.SharedPreferences;

public class SaveLoad2 {

    static SharedPreferences preferences;

    static void saveInteger(int i, String SET_NAME) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(SET_NAME, i);
        editor.apply();
    }

    static int loadInteger(String SET_NAME) {
        int i = 0;
        if (preferences.contains(SET_NAME)) {
            i = preferences.getInt(SET_NAME, 0);
        }
        return i;
    }

    static void saveDouble(double d, String SET_NAME) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat(SET_NAME, (float)d);
        editor.apply();
    }

    static double loadDouble(String SET_NAME) {
        double d = 0;
        if (preferences.contains(SET_NAME)) {
            d = preferences.getFloat(SET_NAME, 0);
        }
        return d;
    }


    void saveTotalJuiceWeGot() {
        saveInteger(DataSingleton.getInstance().getTotalJuiceCount(), "totalJuiceWeGot");
    }

    void saveHomeActivity() {
        saveTotalJuiceWeGot();
    }
}
