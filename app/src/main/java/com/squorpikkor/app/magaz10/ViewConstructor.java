package com.squorpikkor.app.magaz10;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by VadimSquorpikkor on 02.09.2017.
 *
 */

public class ViewConstructor {

    private LinearLayout layout;
    private Context context;

    void createBlock(User user) {
        TextView textView = new TextView(context);
        textView.setText(user.getName() + " -- " + user.totalMoneyCount());
        layout.addView(textView);
        for (Juice juice : user.getCurrentUserOrder()) {
            TextView text = new TextView(context);
            text.setText(juice.getName() + "\t" + juice.getCost() + "\t" + juice.getCount() + "\t" + juice.totalPrice());
            layout.addView(text);
        }

    }

    ViewConstructor(Context context, LinearLayout layout) {
        this.layout = layout;
        this.context = context;

    }

    void createTextViewFromArray(ArrayList<String> list) {
        for (String s : list) {
            TextView textView = new TextView(context);
            textView.setText(s);
            layout.addView(textView);
        }
    }
}