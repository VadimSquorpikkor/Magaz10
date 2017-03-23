package com.squorpikkor.app.magaz10;

// Created by Squorpikkor on 18.03.2017.

import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class EditTextSummator {

    public double multiplexEdit(EditText e1, EditText e2) {
        double d1 = e1.length()==0 ? 0 : Double.parseDouble(e1.getText().toString());
        int i1 = e2.length()==0 ? 0 : Integer.parseInt(e2.getText().toString());
        return d1 * (double)i1;
    }

    public double sumOfLines(ArrayList<EditText> et1, ArrayList<EditText> et2) {
        double res = 0;
        for (int i = 0; i < et1.size(); i++) {
            res += multiplexEdit(et1.get(i), et2.get(i));
        }
        return res;
    }

    public double sumOfLines(ArrayList<EditText> et1, ArrayList<EditText> et2, ArrayList<TextView> txt) {
        double res = 0;
        double temp;
        for (int i = 0; i < et1.size(); i++) {
            temp = multiplexEdit(et1.get(i), et2.get(i));
            txt.get(i).setText(String.valueOf(temp));
            res += temp;
        }
        return res;
    }

    public int intSumOfArray(ArrayList<EditText> list) {
        int res = 0;
        for (EditText edit : list) {
            if (edit.getText().length() != 0) {
                res += Integer.parseInt(edit.getText().toString());
            }

        }
        return res;
    }
}
