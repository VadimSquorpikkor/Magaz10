package com.squorpikkor.app.magaz10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class LeftActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;

    EditText edit1, edit2, edit3, edit4, edit5, edit6, edit7, edit8, edit9, edit10, edit11, edit12, edit13, edit14;

    TextView text1, text2, text3, text4, text5, text6, text7;

    ArrayList<EditText> leftList1 = new ArrayList<>();
    ArrayList<EditText> leftList2 = new ArrayList<>();
//    ArrayList<TextView> leftList3 = new ArrayList<>();

    double moneySpent = 0;

    SaveLoad saveLoad = new SaveLoad();
    EditTextSummator summator = new EditTextSummator();

    SharedPreferences sharedPref1 = getSharedPreferences("leftPref1", Context.MODE_PRIVATE);
    SharedPreferences sharedPref2 = getSharedPreferences("leftPref2", Context.MODE_PRIVATE);
//    SharedPreferences sharedPref3 = getSharedPreferences("leftPref3", Context.MODE_PRIVATE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.left_activity);

        //region FIND VIEW BY ID////////////////////////////
        button1 = (Button) findViewById(R.id.homeButton);
        button2 = (Button) findViewById(R.id.orderButton);
        button3 = (Button) findViewById(R.id.countButton);

        edit1 = (EditText) findViewById(R.id.leftPrice1);
        edit2 = (EditText) findViewById(R.id.leftPrice2);
        edit3 = (EditText) findViewById(R.id.leftPrice3);
        edit4 = (EditText) findViewById(R.id.leftPrice4);
        edit5 = (EditText) findViewById(R.id.leftPrice5);
        edit6 = (EditText) findViewById(R.id.leftPrice6);
        edit7 = (EditText) findViewById(R.id.leftPrice7);
        edit8 = (EditText) findViewById(R.id.leftCount1);
        edit9 = (EditText) findViewById(R.id.leftCount2);
        edit10 = (EditText) findViewById(R.id.leftCount3);
        edit11 = (EditText) findViewById(R.id.leftCount4);
        edit12 = (EditText) findViewById(R.id.leftCount5);
        edit13 = (EditText) findViewById(R.id.leftCount6);
        edit14 = (EditText) findViewById(R.id.leftCount7);

        text1 = (TextView) findViewById(R.id.leftTextTotal1);
        text2 = (TextView) findViewById(R.id.leftTextTotal2);
        text3 = (TextView) findViewById(R.id.leftTextTotal3);
        text4 = (TextView) findViewById(R.id.leftTextTotal4);
        text5 = (TextView) findViewById(R.id.leftTextTotal5);
        text6 = (TextView) findViewById(R.id.leftTextTotal6);
        text7 = (TextView) findViewById(R.id.leftTextTotal7);
        //endregion

        //region ADD TO LIST///////////////////////
        leftList1.add(edit1);
        leftList1.add(edit2);
        leftList1.add(edit3);
        leftList1.add(edit4);
        leftList1.add(edit5);
        leftList1.add(edit6);
        leftList1.add(edit7);

        leftList2.add(edit8);
        leftList2.add(edit9);
        leftList2.add(edit10);
        leftList2.add(edit11);
        leftList2.add(edit12);
        leftList2.add(edit13);
        leftList2.add(edit14);
        //endregion

        /*sharedPref1 = getSharedPreferences("leftPref1", Context.MODE_PRIVATE);
        sharedPref2 = getSharedPreferences("leftPref2", Context.MODE_PRIVATE);
        sharedPref3 = getSharedPreferences("leftPref3", Context.MODE_PRIVATE);*/

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.homeButton:
                        clickActivity(HomeActivity.class);
                        break;
                    case R.id.orderButton:
                        clickActivity(OrderActivity.class);
                        break;
                    case R.id.countButton:
                        //
                        break;

                }
            }
        };

        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
    }

    private void clickActivity(Class c) {
        startActivity(new Intent(this, c));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        saveLoad.saveStringEditArray(leftList1, sharedPref1);
        saveLoad.saveStringEditArray(leftList2, sharedPref2);
//        saveLoad.saveStringEditArray(leftList3, sharedPref2);
    }


}
