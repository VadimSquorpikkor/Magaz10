package com.squorpikkor.app.magaz10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;

public class AddToOrderActivity extends AppCompatActivity {

    ArrayList<String> userOrderList = new ArrayList<>();
    ArrayList<String> ifItJuice = new ArrayList<>();


    EditText editText1, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, editText10;
    CheckBox check1, check2, check3, check4, check5, check6, check7, check8, check9, check10;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_order);

        editText1 = (EditText) findViewById(R.id.userOrder1);
        editText2 = (EditText) findViewById(R.id.userOrder2);
        editText3 = (EditText) findViewById(R.id.userOrder3);
        editText4 = (EditText) findViewById(R.id.userOrder4);
        editText5 = (EditText) findViewById(R.id.userOrder5);
        editText6 = (EditText) findViewById(R.id.userOrder6);
        editText7 = (EditText) findViewById(R.id.userOrder7);
        editText8 = (EditText) findViewById(R.id.userOrder8);
        editText9 = (EditText) findViewById(R.id.userOrder9);
        editText10 = (EditText) findViewById(R.id.userOrder10);

        check1 = (CheckBox) findViewById(R.id.checkJuice1);
        check2 = (CheckBox) findViewById(R.id.checkJuice2);
        check3 = (CheckBox) findViewById(R.id.checkJuice3);
        check4 = (CheckBox) findViewById(R.id.checkJuice4);
        check5 = (CheckBox) findViewById(R.id.checkJuice5);
        check6 = (CheckBox) findViewById(R.id.checkJuice6);
        check7 = (CheckBox) findViewById(R.id.checkJuice7);
        check8 = (CheckBox) findViewById(R.id.checkJuice8);
        check9 = (CheckBox) findViewById(R.id.checkJuice9);
        check10 = (CheckBox) findViewById(R.id.checkJuice10);

        button = (Button) findViewById(R.id.addUserOrder);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.addUserOrder:
                        addOrderToList();
                        break;
                }
            }
        };
    }

    private void addOrderToList() {

    }
}
