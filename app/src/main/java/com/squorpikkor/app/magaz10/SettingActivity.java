package com.squorpikkor.app.magaz10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class SettingActivity extends AppCompatActivity {

    public static int totalJuiceCount;
    public static int bigJuiceCount;
    public static int smallJuiceCount;
    public static int bigMilkCount;
    public static int smallMilkCount;

    SharedPreferences preferences;
    SharedPreferences preferences2;

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    ArrayList<EditText> juiceArrayList = new ArrayList<>();
    ArrayList<EditText> priceArrayList = new ArrayList<>();

    EditText edit1, edit2, edit3, edit4, edit5, edit6, edit7, edit8, edit9, edit10;

    SaveLoad saveLoad;
    EditTextSummator summator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_activity);

        preferences = getSharedPreferences("appSettings", Context.MODE_PRIVATE);
        preferences2 = getSharedPreferences("appSettings2", Context.MODE_PRIVATE);

        saveLoad = new SaveLoad();
        summator = new EditTextSummator();

        //region EDIT & LIST INICIALIZING///////////////////////////////////////////////////////
        edit1 = (EditText) findViewById(R.id.jCount1);
        edit2 = (EditText) findViewById(R.id.jCount2);
        edit3 = (EditText) findViewById(R.id.jCount3);
        edit4 = (EditText) findViewById(R.id.jCount4);
        edit5 = (EditText) findViewById(R.id.jCount5);
        edit6 = (EditText) findViewById(R.id.price1);
        edit7 = (EditText) findViewById(R.id.price2);
        edit8 = (EditText) findViewById(R.id.price3);
        edit9 = (EditText) findViewById(R.id.price4);
        edit10 = (EditText) findViewById(R.id.juiceInOrder);

        button1 = (Button) findViewById(R.id.homeButton);
        button2 = (Button) findViewById(R.id.leftButton);
        button3 = (Button) findViewById(R.id.orderButton);
        button4 = (Button) findViewById(R.id.countButton);

        juiceArrayList.add(edit1);
        juiceArrayList.add(edit2);
        juiceArrayList.add(edit3);
        juiceArrayList.add(edit4);
        juiceArrayList.add(edit5);

        priceArrayList.add(edit6);
        priceArrayList.add(edit7);
        priceArrayList.add(edit8);
        priceArrayList.add(edit9);
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
                    case R.id.orderButton:
                        clickActivity(OrderActivity.class);
                        break;
                    case R.id.countButton:
                        totalJuiceCount = summator.intSumOfArray(juiceArrayList);
                        break;


                }
            }
        };

        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
    }

    private void clickActivity(Class c) {
        startActivity(new Intent(this, c));
    }



    @Override
    protected void onResume() {
        super.onResume();
        saveLoad.loadStringEditArray(juiceArrayList, preferences);
        saveLoad.loadStringEditArray(priceArrayList, preferences2);
    }

    @Override
    protected void onPause() {
        super.onPause();
        saveLoad.saveStringEditArray(juiceArrayList, preferences);
        saveLoad.saveStringEditArray(priceArrayList, preferences2);
    }

    private void calculateProductCount() {
        double field = Double.parseDouble(edit10.getText().toString());
        int CelayaChast = (int)field;
        double DrobnayaChast = field - (double)CelayaChast;

        bigJuiceCount = CelayaChast;
        bigMilkCount = bigJuiceCount * 2;

        if(DrobnayaChast == 0.25)smallJuiceCount = 1;
        else if(DrobnayaChast == 0.5)smallJuiceCount = 2;
        else if(DrobnayaChast == 0.75)smallJuiceCount = 3;
        else smallJuiceCount = 0;

        smallMilkCount = smallJuiceCount * 2;
    }
}
