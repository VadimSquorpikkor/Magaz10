package com.squorpikkor.app.magaz10;

// Created by VadimSquorpikkor on 20.03.2017.

import android.content.SharedPreferences;
import android.widget.EditText;

import java.util.ArrayList;

public class SaveLoad {
    public  void saveStringEdit(EditText edit, String SET_NAME, SharedPreferences sPref) {
        SharedPreferences.Editor editor = sPref.edit();
        editor.putString(SET_NAME, edit.getText().toString());
        editor.apply();
    }

    public void loadStringEdit(EditText edit, String SET_NAME, SharedPreferences sPref) {
        if (sPref.contains(SET_NAME)) {
            edit.setText(sPref.getString(SET_NAME, ""));
        }
    }

    public void saveStringEditArray(ArrayList<EditText> arrayList, SharedPreferences sPref) {
        int count = 1;
        SharedPreferences.Editor editor = sPref.edit();
        for (EditText edit : arrayList) {
            editor.putString("setting" + count, edit.getText().toString());
            count++;
        }
        editor.apply();
    }

    public void loadStringEditArray(ArrayList<EditText> arrayList, SharedPreferences sPref) {
        int count = 1;
        for (EditText edit : arrayList) {
            if (sPref.contains("setting" + count)) {
                edit.setText(sPref.getString("setting" + count, ""));
            }
            count++;
        }
    }
}
