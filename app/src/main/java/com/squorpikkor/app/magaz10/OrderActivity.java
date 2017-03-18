package com.squorpikkor.app.magaz10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;

    EditText edit1, edit2, edit3, edit4, edit5, edit6, edit7, edit8, edit9, edit10,
            edit11, edit12, edit13, edit14, edit15, edit16, edit17, edit18, eedit1, eedit2, eedit3, eedit4, eedit5, eedit6, eedit7, eedit8, eedit9, eedit10,
            eedit11, eedit12, eedit13, eedit14, eedit15, eedit16, eedit17, eedit18, eeedit1, eeedit2, eeedit3, eeedit4, eeedit5, eeedit6, eeedit7, eeedit8, eeedit9, eeedit10,
            eeedit11, eeedit12, eeedit13, eeedit14, eeedit15, eeedit16, eeedit17, eeedit18;

    TextView text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, text14, text15, text16, text17, text18;

    ArrayList<EditText> listOfEdit1 = new ArrayList<>();
    ArrayList<EditText> listOfEdit2 = new ArrayList<>();
    ArrayList<EditText> listOfEdit3 = new ArrayList<>();
    ArrayList<TextView> listOfText = new ArrayList<>();

    EditTextSummator summator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity);

        summator = new EditTextSummator();

        button1 = (Button) findViewById(R.id.homeButton);
        button2 = (Button) findViewById(R.id.leftButton);
        button3 = (Button) findViewById(R.id.countButton);

        //region EDIT & LIST INICIALIZING///////////////////////////////////////////////////////
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        edit3 = (EditText) findViewById(R.id.edit3);
        edit4 = (EditText) findViewById(R.id.edit4);
        edit5 = (EditText) findViewById(R.id.edit5);
        edit6 = (EditText) findViewById(R.id.edit6);
        edit7 = (EditText) findViewById(R.id.edit7);
        edit8 = (EditText) findViewById(R.id.edit8);
        edit9 = (EditText) findViewById(R.id.edit9);
        edit10 = (EditText) findViewById(R.id.edit10);
        edit11 = (EditText) findViewById(R.id.edit11);
        edit12 = (EditText) findViewById(R.id.edit12);
        edit13 = (EditText) findViewById(R.id.edit13);
        edit14 = (EditText) findViewById(R.id.edit14);
        edit15 = (EditText) findViewById(R.id.edit15);
        edit16 = (EditText) findViewById(R.id.edit16);
        edit17 = (EditText) findViewById(R.id.edit17);
        edit18 = (EditText) findViewById(R.id.edit18);

        eedit1 = (EditText) findViewById(R.id.orderPrice1);
        eedit2 = (EditText) findViewById(R.id.orderPrice2);
        eedit3 = (EditText) findViewById(R.id.orderPrice3);
        eedit4 = (EditText) findViewById(R.id.orderPrice4);
        eedit5 = (EditText) findViewById(R.id.orderPrice5);
        eedit6 = (EditText) findViewById(R.id.orderPrice6);
        eedit7 = (EditText) findViewById(R.id.orderPrice7);
        eedit8 = (EditText) findViewById(R.id.orderPrice8);
        eedit9 = (EditText) findViewById(R.id.orderPrice9);
        eedit10 = (EditText) findViewById(R.id.orderPrice10);
        eedit11 = (EditText) findViewById(R.id.orderPrice11);
        eedit12 = (EditText) findViewById(R.id.orderPrice12);
        eedit13 = (EditText) findViewById(R.id.orderPrice13);
        eedit14 = (EditText) findViewById(R.id.orderPrice14);
        eedit15 = (EditText) findViewById(R.id.orderPrice15);
        eedit16 = (EditText) findViewById(R.id.orderPrice16);
        eedit17 = (EditText) findViewById(R.id.orderPrice17);
        eedit18 = (EditText) findViewById(R.id.orderPrice18);

        eeedit1 = (EditText) findViewById(R.id.orderCount1);
        eeedit2 = (EditText) findViewById(R.id.orderCount2);
        eeedit3 = (EditText) findViewById(R.id.orderCount3);
        eeedit4 = (EditText) findViewById(R.id.orderCount4);
        eeedit5 = (EditText) findViewById(R.id.orderCount5);
        eeedit6 = (EditText) findViewById(R.id.orderCount6);
        eeedit7 = (EditText) findViewById(R.id.orderCount7);
        eeedit8 = (EditText) findViewById(R.id.orderCount8);
        eeedit9 = (EditText) findViewById(R.id.orderCount9);
        eeedit10 = (EditText) findViewById(R.id.orderCount10);
        eeedit11 = (EditText) findViewById(R.id.orderCount11);
        eeedit12 = (EditText) findViewById(R.id.orderCount12);
        eeedit13 = (EditText) findViewById(R.id.orderCount13);
        eeedit14 = (EditText) findViewById(R.id.orderCount14);
        eeedit15 = (EditText) findViewById(R.id.orderCount15);
        eeedit16 = (EditText) findViewById(R.id.orderCount16);
        eeedit17 = (EditText) findViewById(R.id.orderCount17);
        eeedit18 = (EditText) findViewById(R.id.orderCount18);

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        text4 = (TextView) findViewById(R.id.text4);
        text5 = (TextView) findViewById(R.id.text5);
        text6 = (TextView) findViewById(R.id.text6);
        text7 = (TextView) findViewById(R.id.text7);
        text8 = (TextView) findViewById(R.id.text8);
        text9 = (TextView) findViewById(R.id.text9);
        text10 = (TextView) findViewById(R.id.text10);
        text11 = (TextView) findViewById(R.id.text11);
        text12 = (TextView) findViewById(R.id.text12);
        text13 = (TextView) findViewById(R.id.text13);
        text14 = (TextView) findViewById(R.id.text14);
        text15 = (TextView) findViewById(R.id.text15);
        text16 = (TextView) findViewById(R.id.text16);
        text17 = (TextView) findViewById(R.id.text17);
        text18 = (TextView) findViewById(R.id.text18);

        listOfEdit1.add(edit1);
        listOfEdit1.add(edit2);
        listOfEdit1.add(edit3);
        listOfEdit1.add(edit4);
        listOfEdit1.add(edit5);
        listOfEdit1.add(edit6);
        listOfEdit1.add(edit7);
        listOfEdit1.add(edit8);
        listOfEdit1.add(edit9);
        listOfEdit1.add(edit10);
        listOfEdit1.add(edit11);
        listOfEdit1.add(edit12);
        listOfEdit1.add(edit13);
        listOfEdit1.add(edit14);
        listOfEdit1.add(edit15);
        listOfEdit1.add(edit16);
        listOfEdit1.add(edit17);
        listOfEdit1.add(edit18);

        listOfEdit2.add(eedit1);
        listOfEdit2.add(eedit2);
        listOfEdit2.add(eedit3);
        listOfEdit2.add(eedit4);
        listOfEdit2.add(eedit5);
        listOfEdit2.add(eedit6);
        listOfEdit2.add(eedit7);
        listOfEdit2.add(eedit8);
        listOfEdit2.add(eedit9);
        listOfEdit2.add(eedit10);
        listOfEdit2.add(eedit11);
        listOfEdit2.add(eedit12);
        listOfEdit2.add(eedit13);
        listOfEdit2.add(eedit14);
        listOfEdit2.add(eedit15);
        listOfEdit2.add(eedit16);
        listOfEdit2.add(eedit17);
        listOfEdit2.add(eedit18);

        listOfEdit3.add(eeedit1);
        listOfEdit3.add(eeedit2);
        listOfEdit3.add(eeedit3);
        listOfEdit3.add(eeedit4);
        listOfEdit3.add(eeedit5);
        listOfEdit3.add(eeedit6);
        listOfEdit3.add(eeedit7);
        listOfEdit3.add(eeedit8);
        listOfEdit3.add(eeedit9);
        listOfEdit3.add(eeedit10);
        listOfEdit3.add(eeedit11);
        listOfEdit3.add(eeedit12);
        listOfEdit3.add(eeedit13);
        listOfEdit3.add(eeedit14);
        listOfEdit3.add(eeedit15);
        listOfEdit3.add(eeedit16);
        listOfEdit3.add(eeedit17);
        listOfEdit3.add(eeedit18);

        listOfText.add(text1);
        listOfText.add(text2);
        listOfText.add(text3);
        listOfText.add(text4);
        listOfText.add(text5);
        listOfText.add(text6);
        listOfText.add(text7);
        listOfText.add(text8);
        listOfText.add(text9);
        listOfText.add(text10);
        listOfText.add(text11);
        listOfText.add(text12);
        listOfText.add(text13);
        listOfText.add(text14);
        listOfText.add(text15);
        listOfText.add(text16);
        listOfText.add(text17);
        listOfText.add(text18);
        //endregion

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.homeButton:
                        clickActivity(HomeActivity.class);
                        break;
                    case R.id.leftButton:
                        clickActivity(LeftActivity.class);
                        break;
                    case R.id.countButton:
                        summator.sumOfLines(listOfEdit2, listOfEdit3, listOfText);
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
}
