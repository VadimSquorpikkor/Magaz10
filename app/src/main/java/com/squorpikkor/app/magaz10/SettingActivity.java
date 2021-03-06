package com.squorpikkor.app.magaz10;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.squorpikkor.app.magaz10.HomeActivity.bigJuiceCount;
import static com.squorpikkor.app.magaz10.HomeActivity.bigMilkCount;
import static com.squorpikkor.app.magaz10.HomeActivity.prefForVar;
import static com.squorpikkor.app.magaz10.HomeActivity.smallJuiceCount;
import static com.squorpikkor.app.magaz10.HomeActivity.smallMilkCount;
import static com.squorpikkor.app.magaz10.HomeActivity.totalJuiceCount;
import static com.squorpikkor.app.magaz10.HomeActivity.totalOrderPrice;
import static com.squorpikkor.app.magaz10.HomeActivity.zeroPriceCount;

public class SettingActivity extends AppCompatActivity {

    public static final String LOGTAG = "LOGGG!!!";

    //public static int totalJuiceCount;

    /*public static int bigJuiceCount;
    public static int smallJuiceCount;
    public static int bigMilkCount;
    public static int smallMilkCount;*/

//    public static int totalJuiceCount;


    TextView txtBJ, txtSJ, txtBM, txtSM, txtTP, txtTJ;

    //public static double totalOrderPrice;

    SharedPreferences preferences;
    SharedPreferences preferences2;
    SharedPreferences preferences3;
    SharedPreferences preferences4;
    SharedPreferences preferences5;

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    ArrayList<EditText> juiceArrayList = new ArrayList<>();
    ArrayList<EditText> priceArrayList = new ArrayList<>();
    ArrayList<Integer> countArrayList = new ArrayList<>();

    EditText edit6, edit7, edit8, edit9, edit10;

    SaveLoad saveLoad;
    EditTextSummator summator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_activity);

        preferences = getSharedPreferences("appSettings", Context.MODE_PRIVATE);
        preferences2 = getSharedPreferences("appSettings2", Context.MODE_APPEND);
        preferences3 = getSharedPreferences("appSettings3", Context.MODE_PRIVATE);
        preferences4 = getSharedPreferences("appSettings4", Context.MODE_PRIVATE);
        preferences5 = getSharedPreferences("appSettings5", Context.MODE_PRIVATE);

        saveLoad = new SaveLoad();
        summator = new EditTextSummator();

        //region EDIT & LIST INICIALIZING///////////////////////////////////////////////////////
        txtBJ = (TextView) findViewById(R.id.textBigJuice);
        txtSJ = (TextView) findViewById(R.id.textSmallJuice);
        txtBM = (TextView) findViewById(R.id.textBigMilk);
        txtSM = (TextView) findViewById(R.id.textSmallMilk);
        txtTP = (TextView) findViewById(R.id.totalNakladnayaPrice);
        txtTJ = (TextView) findViewById(R.id.juiceZakazCount);

//        edit1 = (EditText) findViewById(R.id.jCount1);
//        edit2 = (EditText) findViewById(R.id.jCount2);
//        edit3 = (EditText) findViewById(R.id.jCount3);
//        edit4 = (EditText) findViewById(R.id.jCount4);
//        edit5 = (EditText) findViewById(R.id.jCount5);
        edit6 = (EditText) findViewById(R.id.price1);
        edit7 = (EditText) findViewById(R.id.price2);
        edit8 = (EditText) findViewById(R.id.price3);
        edit9 = (EditText) findViewById(R.id.price4);
        edit10 = (EditText) findViewById(R.id.juiceInOrder);

        button1 = (Button) findViewById(R.id.homeButton);
        button2 = (Button) findViewById(R.id.leftButton);
        button3 = (Button) findViewById(R.id.orderButton);
        button4 = (Button) findViewById(R.id.countButton);

//        juiceArrayList.add(edit1);
//        juiceArrayList.add(edit2);
//        juiceArrayList.add(edit3);
//        juiceArrayList.add(edit4);
//        juiceArrayList.add(edit5);

        priceArrayList.add(edit6);
        priceArrayList.add(edit7);
        priceArrayList.add(edit8);
        priceArrayList.add(edit9);

        countArrayList.add(totalJuiceCount);
        countArrayList.add(bigJuiceCount);
        countArrayList.add(bigMilkCount);
        countArrayList.add(smallJuiceCount);
        countArrayList.add(smallMilkCount);
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
                        //totalJuiceCount = summator.intSumOfArray(juiceArrayList);
                        totalJuiceCount = zeroPriceCount;
                        calculateProductCount();
                        totalOrderPrice();
                        displayVar();
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

    void displayVar() {
        txtBJ.setText(String.valueOf(bigJuiceCount));
        txtSJ.setText(String.valueOf(smallJuiceCount));
        txtBM.setText(String.valueOf(bigMilkCount));
        txtSM.setText(String.valueOf(smallMilkCount));
        txtTP.setText(String.valueOf(totalOrderPrice));
        txtTJ.setText(String.valueOf(totalJuiceCount));
    }


    @Override
    protected void onResume() {
        super.onResume();

        Log.e(LOGTAG, "SETTINGS zeroPriceCount: " + zeroPriceCount);
        saveLoad.loadStringEditArray(juiceArrayList, preferences);
        saveLoad.loadStringEditArray(priceArrayList, preferences2);
        saveLoad.loadIntArray(countArrayList, preferences3);
        saveLoad.loadStringEdit(edit10, "setInvoice", preferences4);

        //totalJuiceCount = summator.intSumOfArray(juiceArrayList);
        //zeroPriceCount = saveLoad.loadInteger("totJ", preferences5);
        //totalJuiceCount = zeroPriceCount;//////////////////
        totalJuiceCount = saveLoad.loadInteger("totJ", preferences5);
        totalJuiceCount = zeroPriceCount;
        calculateProductCount();
        totalOrderPrice();
        displayVar();

        Log.e(LOGTAG, "SETTINGS zeroPriceCount: " + zeroPriceCount);

    }

    @Override
    protected void onPause() {
        super.onPause();
        /**To prevent error on parse to double from empty field  ********/
        if(edit6.getText().toString().equals(""))edit6.setText("0"); /***/
        if(edit8.getText().toString().equals(""))edit8.setText("0"); /***/
        if(edit7.getText().toString().equals(""))edit7.setText("0"); /***/
        if(edit9.getText().toString().equals(""))edit9.setText("0"); /***/
        if(edit10.getText().length()==0)edit10.setText("0"); /**same*/
        /****************************************************************/
        saveLoad.saveStringEditArray(juiceArrayList, preferences);
        saveLoad.saveStringEditArray(priceArrayList, preferences2);
        saveLoad.saveIntArray(countArrayList, preferences3);
        saveLoad.saveStringEdit(edit10, "setInvoice", preferences4);

        //totalJuiceCount = summator.intSumOfArray(juiceArrayList);
        totalJuiceCount = zeroPriceCount;
        saveLoad.saveInteger(totalJuiceCount, "totJ", preferences5);
        calculateProductCount();
        totalOrderPrice();
        displayVar();

        Log.e(LOGTAG, "SETTINGS zeroPriceCount: " + zeroPriceCount);


        saveLoad.saveDouble(totalOrderPrice, "set1", prefForVar);
        saveLoad.saveInteger(totalJuiceCount, "set5", prefForVar);
    }

    /*private void calculateProductCount() {
        edit10.setTextColor(Color.WHITE);
        double field = Double.parseDouble(edit10.getText().toString()) * 2;
        int IntegerPart = (int)field;
        double FractionalPart = field - (double)IntegerPart;

        bigJuiceCount = IntegerPart;
        bigMilkCount = bigJuiceCount * 2;

        if (FractionalPart == 0)smallJuiceCount = 0;
        else if(FractionalPart == 0.25)smallJuiceCount = 1;
        else if(FractionalPart == 0.5)smallJuiceCount = 2;
        else if(FractionalPart == 0.75)smallJuiceCount = 3;
        else {smallJuiceCount = 0;
            Toast.makeText(this, "Неправильное значение!", Toast.LENGTH_SHORT).show();
            bigJuiceCount = 0;
            bigMilkCount = 0;
            smallJuiceCount = 0;
            smallMilkCount = 0;
            edit10.setTextColor(Color.RED);
        }*/

    private void calculateProductCount() {
        edit10.setTextColor(Color.WHITE);
        double fieldJuice;
        double fieldMilk;

        /*if (!edit10.getText().toString().equals("")) {
            fieldJuice = Double.parseDouble(edit10.getText().toString());
            fieldMilk = Double.parseDouble(edit10.getText().toString()) * 2;
        } else {
            edit10.setText("0");
            fieldJuice = 0;
            fieldMilk = 0;
        }*/
        if(edit10.getText().toString().equals(""))edit10.setText("0"); //To prevent error on parse to double from empty field
        fieldJuice = Double.parseDouble(edit10.getText().toString());
        fieldMilk = Double.parseDouble(edit10.getText().toString()) * 2;

        int IntegerPartJuice = (int)fieldJuice;
        int IntegerPartMilk = (int)fieldMilk;
        double FractionalPartJuice = fieldJuice - (double)IntegerPartJuice;
        double FractionalPartMilk = fieldMilk - (double)IntegerPartMilk;

        bigJuiceCount = IntegerPartJuice;
        bigMilkCount = IntegerPartMilk;

        if (FractionalPartJuice == 0)smallJuiceCount = 0;
        else if(FractionalPartJuice == 0.25)smallJuiceCount = 1;
        else if(FractionalPartJuice == 0.5)smallJuiceCount = 2;
        else if(FractionalPartJuice == 0.75)smallJuiceCount = 3;
        else {smallJuiceCount = 0;
            Toast.makeText(this, "Неправильное значение!", Toast.LENGTH_SHORT).show();
            bigJuiceCount = 0;
            bigMilkCount = 0;
            smallJuiceCount = 0;
            smallMilkCount = 0;
            edit10.setTextColor(Color.RED);
        }

        if (FractionalPartMilk == 0)smallMilkCount = 0;
        else if(FractionalPartMilk == 0.25)smallMilkCount = 1;
        else if(FractionalPartMilk == 0.5)smallMilkCount = 2;
        else if(FractionalPartMilk == 0.75)smallMilkCount = 3;
        else {smallMilkCount = 0;
            Toast.makeText(this, "Неправильное значение!", Toast.LENGTH_SHORT).show();
            bigJuiceCount = 0;
            bigMilkCount = 0;
            smallJuiceCount = 0;
            smallMilkCount = 0;
            edit10.setTextColor(Color.RED);
        }

    }

    private void totalOrderPrice() {
        /**To prevent error on parse to double from empty field  ********/
        if(edit6.getText().toString().equals(""))edit6.setText("0"); /***/
        if(edit8.getText().toString().equals(""))edit8.setText("0"); /***/
        if(edit7.getText().toString().equals(""))edit7.setText("0"); /***/
        if(edit9.getText().toString().equals(""))edit9.setText("0"); /***/
        if(edit10.getText().length()==0)edit10.setText("0"); /***/
        /****************************************************************/
        double bigJuicePrice = Double.parseDouble(edit6.getText().toString());
        double bigMilkPrice = Double.parseDouble(edit8.getText().toString());
        double smallJuicePrice = Double.parseDouble(edit7.getText().toString());
        double smallMilkPrice = Double.parseDouble(edit9.getText().toString());

        double res = 0;
        res += (bigJuicePrice * bigJuiceCount) +
                (bigMilkPrice * bigMilkCount) +
                (smallJuicePrice * smallJuiceCount) +
                (smallMilkPrice * smallMilkCount);

        res = Math.floor(res * 100) / 100;//2 numbers after the dot

        totalOrderPrice = res;


    }


}
