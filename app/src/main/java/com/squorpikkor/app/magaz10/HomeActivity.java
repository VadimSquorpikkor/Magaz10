package com.squorpikkor.app.magaz10;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Collections;
import java.util.Enumeration;

public class HomeActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    EditText edit1, edit2, edit3, edit4, edit5, edit6, edit7, edit8, edit9, edit10,
            edit11, edit12, edit13, edit14, edit15, edit16, edit17, edit18, edit19,
            edit20, edit21, edit22, edit23, edit24, edit25, edit26, edit27, edit28;

    public enum EDITLIST {
        edit1, edit2, edit3, edit4, edit5, edit6, edit7, edit8, edit9, edit10,
        edit11, edit12, edit13, edit14, edit15, edit16, edit17, edit18, edit19,
        edit20, edit21, edit22, edit23, edit24, edit25, edit26, edit27, edit28
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);



        button1 = (Button) findViewById(R.id.SetValueButton);
        button2 = (Button) findViewById(R.id.leftButton);
        button3 = (Button) findViewById(R.id.orderButton);
        button4 = (Button) findViewById(R.id.countButton);
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
        edit19 = (EditText) findViewById(R.id.edit19);
        edit20 = (EditText) findViewById(R.id.edit20);
        edit21 = (EditText) findViewById(R.id.edit21);
        edit22 = (EditText) findViewById(R.id.edit22);
        edit23 = (EditText) findViewById(R.id.edit23);
        edit24 = (EditText) findViewById(R.id.edit24);
        edit25 = (EditText) findViewById(R.id.edit25);
        edit26 = (EditText) findViewById(R.id.edit26);
        edit27 = (EditText) findViewById(R.id.edit27);
        edit28 = (EditText) findViewById(R.id.edit28);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.SetValueButton:
                        clickActivity(SettingActivity.class);
                        break;
                    case R.id.leftButton:
                        clickActivity(LeftActivity.class);
                        break;
                    case R.id.orderButton:
                        clickActivity(OrderActivity.class);
                        break;
                    case R.id.countButton:
                        //count
                        edit1.setText("777");

                        break;


                }
            }
        };

        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);

//        int[] arrayO
    }

    public void clickActivity(Class c) {
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }

    public int[] arrayOfEdit(Enum anEnum) {
        int[] res = new int[28];
        int i = 0;
        /*for (EDITLIST edit : EDITLIST.values()) {
            res[i] = edit.
        }*/
        for (EditText edit : Collections.list((Enumeration<EditText>) anEnum)) {
            res[i] = Integer.parseInt(edit.getText().toString());
            i++;
        }
        return res;
    }
}
