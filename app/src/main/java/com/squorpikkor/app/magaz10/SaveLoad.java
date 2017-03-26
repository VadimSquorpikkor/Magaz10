package com.squorpikkor.app.magaz10;

// Created by VadimSquorpikkor on 20.03.2017.

import android.content.SharedPreferences;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

class SaveLoad {

    void saveStringEdit(EditText edit, String SET_NAME, SharedPreferences sPref) {
        SharedPreferences.Editor editor = sPref.edit();
        editor.putString(SET_NAME, edit.getText().toString());
        editor.apply();
    }

    void loadStringEdit(EditText edit, String SET_NAME, SharedPreferences sPref) {
        if (sPref.contains(SET_NAME)) {
            edit.setText(sPref.getString(SET_NAME, ""));
        }
    }

    void saveInteger(int i, String SET_NAME, SharedPreferences sPref) {
        SharedPreferences.Editor editor = sPref.edit();
        editor.putInt(SET_NAME, i);
        editor.apply();
    }

    int loadInteger(String SET_NAME, SharedPreferences sPref) {
        int i = 0;
        if (sPref.contains(SET_NAME)) {
            i = sPref.getInt(SET_NAME, 0);
        }
        return i;
    }

    void saveDouble(double d, String SET_NAME, SharedPreferences sPref) {
        SharedPreferences.Editor editor = sPref.edit();
        editor.putFloat(SET_NAME, (float)d);
        editor.apply();
    }

    double loadDouble(String SET_NAME, SharedPreferences sPref) {
        double d = 0;
        if (sPref.contains(SET_NAME)) {
            d = sPref.getFloat(SET_NAME, 0);
        }
        return d;
    }

    void saveStringEditArray(ArrayList<EditText> arrayList, SharedPreferences sPref) {
        int count = 1;
        SharedPreferences.Editor editor = sPref.edit();
        for (EditText edit : arrayList) {
            editor.putString("setting" + count, edit.getText().toString());
            count++;
        }
        editor.apply();
    }

    void loadStringEditArray(ArrayList<EditText> arrayList, SharedPreferences sPref) {
        int count = 1;
        for (EditText edit : arrayList) {
            if (sPref.contains("setting" + count)) {
                edit.setText(sPref.getString("setting" + count, ""));
            }
            count++;
        }
    }

    void saveBooleanArray(boolean[] array, SharedPreferences sPref) {
        int count = 1;
        SharedPreferences.Editor editor = sPref.edit();
        for (boolean b : array) {
            editor.putBoolean("setting" + count, b);
            count++;
        }
        editor.apply();
    }

    void loadBooleanArray(boolean[] array, SharedPreferences sPref) {
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if (sPref.contains("setting" + count)) {
                array[i] = sPref.getBoolean("setting" + count, false);
            }
            count++;
        }
    }

    void saveStringTViewArray(ArrayList<TextView> arrayList, SharedPreferences sPref) {
        int count = 1;
        SharedPreferences.Editor editor = sPref.edit();
        for (TextView textView : arrayList) {
            editor.putString("setting" + count, textView.getText().toString());
            count++;
        }
        editor.apply();
    }

    void loadStringTViewArray(ArrayList<TextView> arrayList, SharedPreferences sPref) {
        int count = 1;
        for (TextView textView : arrayList) {
            if (sPref.contains("setting" + count)) {
                textView.setText(sPref.getString("setting" + count, ""));
            }
            count++;
        }
    }

    void saveIntArray(ArrayList<Integer> arrayList, SharedPreferences sPref) {
        int count = 1;
        SharedPreferences.Editor editor = sPref.edit();
        for (int i : arrayList) {
            editor.putInt("setting" + count, i);
            count++;
        }
        editor.apply();
    }

    void loadIntArray(ArrayList<Integer> arrayList, SharedPreferences sPref) {
        int count = 1;
        for (int i = 0; i < arrayList.size(); i++) {
            if (sPref.contains("setting" + count)) {
                arrayList.set(i, sPref.getInt("setting" + count, 0));
            }
            count++;
        }
    }

    void clearList(ArrayList<EditText> list, String defaultValue) {
        for (EditText edit : list) {
            edit.setText(defaultValue);
        }
    }

    void clearTextList(ArrayList<TextView> list, String defaultValue) {
        for (TextView textView : list) {
            textView.setText(defaultValue);
        }
    }
}
