package com.squorpikkor.app.magaz10;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by VadimSquorpikkor on 02.09.2017.
 *
 */

public class ViewConstructor {

    private LinearLayout layout;
    private Context context;


//    ArrayList<TextView>

    void createBlock(User user) {
        LinearLayout smallLayout = new LinearLayout(context);
        smallLayout.setOrientation(LinearLayout.HORIZONTAL);
        makeTextView(user.getName(), smallLayout, 200);
        makeTextView(String.valueOf(user.totalMoneyCount()), smallLayout, 100);
        layout.addView(smallLayout);

//        makeButton("Butt1", smallLayout, );

        /*EditText edit = new EditText(context);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        layout.addView(edit);*/

        for (Juice juice : user.getCurrentUserOrder()) {
            LinearLayout smallLayout2 = new LinearLayout(context);
            smallLayout2.setOrientation(LinearLayout.HORIZONTAL);

            //String s = juice.getName() + "\t" + juice.getCost() + "\t" + juice.getCount() + "\t" + juice.totalPrice();
            makeTextView(juice.getName(), smallLayout2, 400);
            makeTextView(juice.getCost()+"", smallLayout2, 100);
            makeTextView(juice.getCount()+"", smallLayout2, 100);
            makeTextView(juice.totalPrice()+"", smallLayout2, 100);
            layout.addView(smallLayout2);

        }
    }

    void makeTextView(String text, LinearLayout parentLayout, int width) {
        TextView textView = new TextView(context);
        textView.setText(text);
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            textView.setTextAppearance(R.style.WeightTextStyle);
            Log.e(TAG, "makeTextView: !!!");

        }
        //textView.setPadding(10,0,10,0);*/
        textView.setTextSize(15);
        textView.setWidth(width);
        parentLayout.addView(textView);
    }

    void makeEditText(String text, LinearLayout parentLayout) {
        EditText editText = new EditText(context);
        parentLayout.addView(editText);
    }

    void makeButton(String text, LinearLayout parentLayout, final LinearLayout layoutToHide) {
        Button button = new Button(context);
        button.setText(text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutToHide.setVisibility(View.INVISIBLE);
            }
        });
    }

    ViewConstructor(Context context, LinearLayout layout) {
        this.layout = layout;
        this.context = context;
    }

    View.OnClickListener listener1= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            
        }
    };

    void createTextViewFromArray(ArrayList<String> list) {
        for (String s : list) {
            TextView textView = new TextView(context);
            textView.setText(s);
            layout.addView(textView);
        }
    }
}