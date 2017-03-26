package com.squorpikkor.app.magaz10;

// Created by Squorpikkor on 18.03.2017.

import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

class EditTextSummator {

    double multiplexEdit(EditText e1, EditText e2) {
        double res;
        double d1 = e1.length()==0 ? 0 : Double.parseDouble(e1.getText().toString());
        int i1 = e2.length()==0 ? 0 : Integer.parseInt(e2.getText().toString());
        res =  d1 * (double)i1;
        res = Math.floor(res * 100) / 100;//2 numbers after the dot
        return res;
    }

    double sumOfLines(ArrayList<EditText> et1, ArrayList<EditText> et2) {
        double res = 0;
        for (int i = 0; i < et1.size(); i++) {
            res += multiplexEdit(et1.get(i), et2.get(i));
        }
        res = Math.floor(res * 100) / 100;//2 numbers after the dot
        return res;
    }

    double sumOfLines(ArrayList<EditText> et1, ArrayList<EditText> et2, ArrayList<TextView> txt) {
        double res = 0;
        double temp;
        for (int i = 0; i < et1.size(); i++) {
            temp = multiplexEdit(et1.get(i), et2.get(i));
            txt.get(i).setText(String.valueOf(temp));
            res += temp;
        }
        res = Math.floor(res * 100) / 100;//2 numbers after the dot
        return res;
    }

    int intSumOfArray(ArrayList<EditText> list) {
        int res = 0;
        for (EditText edit : list) {
            if (edit.getText().length() != 0) {
                res += Integer.parseInt(edit.getText().toString());
            }

        }
        return res;
    }
}
