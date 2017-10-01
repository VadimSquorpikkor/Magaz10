package com.squorpikkor.app.magaz10;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
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
        LinearLayout smallLayout = new LinearLayout(context);
        smallLayout.setOrientation(LinearLayout.HORIZONTAL);
        makeTextView(user.getName(), smallLayout);
        makeTextView(String.valueOf(user.totalMoneyCount()), smallLayout);
        layout.addView(smallLayout);

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
            makeTextView(juice.getName(), smallLayout2);
            makeTextView(juice.getCost()+"", smallLayout2);
            makeTextView(juice.getCount()+"", smallLayout2);
            makeTextView(juice.totalPrice()+"", smallLayout2);
            layout.addView(smallLayout2);

        }
    }

    void makeTextView(String text, LinearLayout layout) {
        TextView textView = new TextView(context);
        textView.setText(text);
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            textView.setTextAppearance(R.style.editStyle);

        }*/
        textView.setPadding(10,0,10,0);
        layout.addView(textView);
    }

    void makeEditText(String text, LinearLayout layout) {
        EditText editText = new EditText(context);
        layout.addView(editText);
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