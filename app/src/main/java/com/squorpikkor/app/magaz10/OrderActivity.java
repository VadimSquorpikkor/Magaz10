package com.squorpikkor.app.magaz10;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import static com.squorpikkor.app.magaz10.HomeActivity.ordersSumma;
import static com.squorpikkor.app.magaz10.HomeActivity.prefForVar;
import static com.squorpikkor.app.magaz10.HomeActivity.zeroPriceCount;

public class OrderActivity extends AppCompatActivity {

    SharedPreferences oSettings1;
    SharedPreferences oSettings2;
    SharedPreferences oSettings3;
    SharedPreferences oSettings4;
    SharedPreferences oSettings5;
//    SharedPreferences oSettings6;

    public static final String LOGTAG = "LOGGG!!!";

    Button button1, button2, button3, button4, button5, phonesButton;

//    public static double ordersSumma;
//    public static int zeroPriceCount;

    EditText edit1, edit2, edit3, edit4, edit5, edit6, edit7, edit8, edit9, edit10,
            edit11, edit12, edit13, edit14, edit15, edit16, edit17, edit18, edit19, edit20, edit21, edit22, edit23, edit24, edit25, edit26, edit27, edit28, edit29,
            edit30, edit31, edit32, edit33, edit34, edit35, edit36,

    eedit1, eedit2, eedit3, eedit4, eedit5, eedit6, eedit7, eedit8, eedit9, eedit10,
            eedit11, eedit12, eedit13, eedit14, eedit15, eedit16, eedit17, eedit18, eedit19, eedit20, eedit21, eedit22, eedit23, eedit24, eedit25, eedit26, eedit27, eedit28, eedit29,
            eedit30, eedit31, eedit32, eedit33, eedit34, eedit35, eedit36,

    eeedit1, eeedit2, eeedit3, eeedit4, eeedit5, eeedit6, eeedit7, eeedit8, eeedit9, eeedit10,
            eeedit11, eeedit12, eeedit13, eeedit14, eeedit15, eeedit16, eeedit17, eeedit18, eeedit19, eeedit20, eeedit21, eeedit22, eeedit23, eeedit24, eeedit25, eeedit26,
            eeedit27, eeedit28, eeedit29, eeedit30, eeedit31, eeedit32, eeedit33, eeedit34, eeedit35, eeedit36;

    TextView text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, text14, text15, text16, text17, text18,
            text19, text20, text21, text22, text23, text24, text25, text26, text27, text28, text29, text30, text31, text32, text33, text34, text35, text36;

    CheckBox check1, check2, check3, check4, check5, check6, check7, check8, check9, check10, check11, check12, check13, check14, check15, check16, check17, check18,
            check19, check20, check21, check22, check23, check24, check25, check26, check27, check28, check29, check30, check31, check32, check33, check34, check35, check36;


    TextView moneyForBonusTotal;

    ArrayList<EditText> listOfItems = new ArrayList<>();
    ArrayList<EditText> listOfPrices = new ArrayList<>();
    ArrayList<EditText> listOfItemCount = new ArrayList<>();
    ArrayList<TextView> listOfText = new ArrayList<>();
    boolean[] checkSaverArray = new boolean[36];

    EditTextSummator summator;
    SaveLoad saveLoad;

    ArrayList<CheckBox> chList = new ArrayList<>();

    String phonesText = "Крот - 145\nПраневич - 136\nВася - 104\nСергей Каменщиков (Корелин) - (9)2651237";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity);

        oSettings1 = getSharedPreferences("orderSettings1", Context.MODE_PRIVATE);
        oSettings2 = getSharedPreferences("orderSettings2", Context.MODE_PRIVATE);
        oSettings3 = getSharedPreferences("orderSettings3", Context.MODE_PRIVATE);
        oSettings4 = getSharedPreferences("orderSettings4", Context.MODE_PRIVATE);
        oSettings5 = getSharedPreferences("orderSettings5", Context.MODE_PRIVATE);
//        oSettings6 = getSharedPreferences("orderSettings6", Context.MODE_PRIVATE);

        summator = new EditTextSummator();
        saveLoad = new SaveLoad();

        button1 = (Button) findViewById(R.id.homeButton);
        button2 = (Button) findViewById(R.id.leftButton);
        button3 = (Button) findViewById(R.id.countButton);
        button4 = (Button) findViewById(R.id.orderClearButton);
        button5 = (Button) findViewById(R.id.SetValueButton);
        phonesButton = (Button)findViewById(R.id.phonesButton);

        moneyForBonusTotal = (TextView) findViewById(R.id.orderBonusMoneySpent);

        //region EDIT & LIST INICIALIZING///////////////////////////////////////////////////////
        edit1 = (EditText) findViewById(R.id.orderName1);
        edit2 = (EditText) findViewById(R.id.orderName2);
        edit3 = (EditText) findViewById(R.id.orderName3);
        edit4 = (EditText) findViewById(R.id.orderName4);
        edit5 = (EditText) findViewById(R.id.orderName5);
        edit6 = (EditText) findViewById(R.id.orderName6);
        edit7 = (EditText) findViewById(R.id.orderName7);
        edit8 = (EditText) findViewById(R.id.orderName8);
        edit9 = (EditText) findViewById(R.id.orderName9);
        edit10 = (EditText) findViewById(R.id.orderName10);
        edit11 = (EditText) findViewById(R.id.orderName11);
        edit12 = (EditText) findViewById(R.id.orderName12);
        edit13 = (EditText) findViewById(R.id.orderName13);
        edit14 = (EditText) findViewById(R.id.orderName14);
        edit15 = (EditText) findViewById(R.id.orderName15);
        edit16 = (EditText) findViewById(R.id.orderName16);
        edit17 = (EditText) findViewById(R.id.orderName17);
        edit18 = (EditText) findViewById(R.id.orderName18);
        edit19 = (EditText) findViewById(R.id.orderName19);
        edit20 = (EditText) findViewById(R.id.orderName20);
        edit21 = (EditText) findViewById(R.id.orderName21);
        edit22 = (EditText) findViewById(R.id.orderName22);
        edit23 = (EditText) findViewById(R.id.orderName23);
        edit24 = (EditText) findViewById(R.id.orderName24);
        edit25 = (EditText) findViewById(R.id.orderName25);
        edit26 = (EditText) findViewById(R.id.orderName26);
        edit27 = (EditText) findViewById(R.id.orderName27);
        edit28 = (EditText) findViewById(R.id.orderName28);
        edit29 = (EditText) findViewById(R.id.orderName29);
        edit30 = (EditText) findViewById(R.id.orderName30);
        edit31 = (EditText) findViewById(R.id.orderName31);
        edit32 = (EditText) findViewById(R.id.orderName32);
        edit33 = (EditText) findViewById(R.id.orderName33);
        edit34 = (EditText) findViewById(R.id.orderName34);
        edit35 = (EditText) findViewById(R.id.orderName35);
        edit36 = (EditText) findViewById(R.id.orderName36);

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
        eedit19 = (EditText) findViewById(R.id.orderPrice19);
        eedit20 = (EditText) findViewById(R.id.orderPrice20);
        eedit21 = (EditText) findViewById(R.id.orderPrice21);
        eedit22 = (EditText) findViewById(R.id.orderPrice22);
        eedit23 = (EditText) findViewById(R.id.orderPrice23);
        eedit24 = (EditText) findViewById(R.id.orderPrice24);
        eedit25 = (EditText) findViewById(R.id.orderPrice25);
        eedit26 = (EditText) findViewById(R.id.orderPrice26);
        eedit27 = (EditText) findViewById(R.id.orderPrice27);
        eedit28 = (EditText) findViewById(R.id.orderPrice28);
        eedit29 = (EditText) findViewById(R.id.orderPrice29);
        eedit30 = (EditText) findViewById(R.id.orderPrice30);
        eedit31 = (EditText) findViewById(R.id.orderPrice31);
        eedit32 = (EditText) findViewById(R.id.orderPrice32);
        eedit33 = (EditText) findViewById(R.id.orderPrice33);
        eedit34 = (EditText) findViewById(R.id.orderPrice34);
        eedit35 = (EditText) findViewById(R.id.orderPrice35);
        eedit36 = (EditText) findViewById(R.id.orderPrice36);

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
        eeedit19 = (EditText) findViewById(R.id.orderCount19);
        eeedit20 = (EditText) findViewById(R.id.orderCount20);
        eeedit21 = (EditText) findViewById(R.id.orderCount21);
        eeedit22 = (EditText) findViewById(R.id.orderCount22);
        eeedit23 = (EditText) findViewById(R.id.orderCount23);
        eeedit24 = (EditText) findViewById(R.id.orderCount24);
        eeedit25 = (EditText) findViewById(R.id.orderCount25);
        eeedit26 = (EditText) findViewById(R.id.orderCount26);
        eeedit27 = (EditText) findViewById(R.id.orderCount27);
        eeedit28 = (EditText) findViewById(R.id.orderCount28);
        eeedit29 = (EditText) findViewById(R.id.orderCount29);
        eeedit30 = (EditText) findViewById(R.id.orderCount30);
        eeedit31 = (EditText) findViewById(R.id.orderCount31);
        eeedit32 = (EditText) findViewById(R.id.orderCount32);
        eeedit33 = (EditText) findViewById(R.id.orderCount33);
        eeedit34 = (EditText) findViewById(R.id.orderCount34);
        eeedit35 = (EditText) findViewById(R.id.orderCount35);
        eeedit36 = (EditText) findViewById(R.id.orderCount36);

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
        text19 = (TextView) findViewById(R.id.text19);
        text20 = (TextView) findViewById(R.id.text20);
        text21 = (TextView) findViewById(R.id.text21);
        text22 = (TextView) findViewById(R.id.text22);
        text23 = (TextView) findViewById(R.id.text23);
        text24 = (TextView) findViewById(R.id.text24);
        text25 = (TextView) findViewById(R.id.text25);
        text26 = (TextView) findViewById(R.id.text26);
        text27 = (TextView) findViewById(R.id.text27);
        text28 = (TextView) findViewById(R.id.text28);
        text29 = (TextView) findViewById(R.id.text29);
        text30 = (TextView) findViewById(R.id.text30);
        text31 = (TextView) findViewById(R.id.text31);
        text32 = (TextView) findViewById(R.id.text32);
        text33 = (TextView) findViewById(R.id.text33);
        text34 = (TextView) findViewById(R.id.text34);
        text35 = (TextView) findViewById(R.id.text35);
        text36 = (TextView) findViewById(R.id.text36);

        check1 = (CheckBox) findViewById(R.id.checkBox1);
        check2 = (CheckBox) findViewById(R.id.checkBox2);
        check3 = (CheckBox) findViewById(R.id.checkBox3);
        check4 = (CheckBox) findViewById(R.id.checkBox4);
        check5 = (CheckBox) findViewById(R.id.checkBox5);
        check6 = (CheckBox) findViewById(R.id.checkBox6);
        check7 = (CheckBox) findViewById(R.id.checkBox7);
        check8 = (CheckBox) findViewById(R.id.checkBox8);
        check9 = (CheckBox) findViewById(R.id.checkBox9);
        check10 = (CheckBox) findViewById(R.id.checkBox10);
        check11 = (CheckBox) findViewById(R.id.checkBox11);
        check12 = (CheckBox) findViewById(R.id.checkBox12);
        check13 = (CheckBox) findViewById(R.id.checkBox13);
        check14 = (CheckBox) findViewById(R.id.checkBox14);
        check15 = (CheckBox) findViewById(R.id.checkBox15);
        check16 = (CheckBox) findViewById(R.id.checkBox16);
        check17 = (CheckBox) findViewById(R.id.checkBox17);
        check18 = (CheckBox) findViewById(R.id.checkBox18);
        check19 = (CheckBox) findViewById(R.id.checkBox19);
        check20 = (CheckBox) findViewById(R.id.checkBox20);
        check21 = (CheckBox) findViewById(R.id.checkBox21);
        check22 = (CheckBox) findViewById(R.id.checkBox22);
        check23 = (CheckBox) findViewById(R.id.checkBox23);
        check24 = (CheckBox) findViewById(R.id.checkBox24);
        check25 = (CheckBox) findViewById(R.id.checkBox25);
        check26 = (CheckBox) findViewById(R.id.checkBox26);
        check27 = (CheckBox) findViewById(R.id.checkBox27);
        check28 = (CheckBox) findViewById(R.id.checkBox28);
        check29 = (CheckBox) findViewById(R.id.checkBox29);
        check30 = (CheckBox) findViewById(R.id.checkBox30);
        check31 = (CheckBox) findViewById(R.id.checkBox31);
        check32 = (CheckBox) findViewById(R.id.checkBox32);
        check33 = (CheckBox) findViewById(R.id.checkBox33);
        check34 = (CheckBox) findViewById(R.id.checkBox34);
        check35 = (CheckBox) findViewById(R.id.checkBox35);
        check36 = (CheckBox) findViewById(R.id.checkBox36);

        listOfItems.add(edit1);
        listOfItems.add(edit2);
        listOfItems.add(edit3);
        listOfItems.add(edit4);
        listOfItems.add(edit5);
        listOfItems.add(edit6);
        listOfItems.add(edit7);
        listOfItems.add(edit8);
        listOfItems.add(edit9);
        listOfItems.add(edit10);
        listOfItems.add(edit11);
        listOfItems.add(edit12);
        listOfItems.add(edit13);
        listOfItems.add(edit14);
        listOfItems.add(edit15);
        listOfItems.add(edit16);
        listOfItems.add(edit17);
        listOfItems.add(edit18);
        listOfItems.add(edit19);
        listOfItems.add(edit20);
        listOfItems.add(edit21);
        listOfItems.add(edit22);
        listOfItems.add(edit23);
        listOfItems.add(edit24);
        listOfItems.add(edit25);
        listOfItems.add(edit26);
        listOfItems.add(edit27);
        listOfItems.add(edit28);
        listOfItems.add(edit29);
        listOfItems.add(edit30);
        listOfItems.add(edit31);
        listOfItems.add(edit32);
        listOfItems.add(edit33);
        listOfItems.add(edit34);
        listOfItems.add(edit35);
        listOfItems.add(edit36);

        listOfPrices.add(eedit1);
        listOfPrices.add(eedit2);
        listOfPrices.add(eedit3);
        listOfPrices.add(eedit4);
        listOfPrices.add(eedit5);
        listOfPrices.add(eedit6);
        listOfPrices.add(eedit7);
        listOfPrices.add(eedit8);
        listOfPrices.add(eedit9);
        listOfPrices.add(eedit10);
        listOfPrices.add(eedit11);
        listOfPrices.add(eedit12);
        listOfPrices.add(eedit13);
        listOfPrices.add(eedit14);
        listOfPrices.add(eedit15);
        listOfPrices.add(eedit16);
        listOfPrices.add(eedit17);
        listOfPrices.add(eedit18);
        listOfPrices.add(eedit19);
        listOfPrices.add(eedit20);
        listOfPrices.add(eedit21);
        listOfPrices.add(eedit22);
        listOfPrices.add(eedit23);
        listOfPrices.add(eedit24);
        listOfPrices.add(eedit25);
        listOfPrices.add(eedit26);
        listOfPrices.add(eedit27);
        listOfPrices.add(eedit28);
        listOfPrices.add(eedit29);
        listOfPrices.add(eedit30);
        listOfPrices.add(eedit31);
        listOfPrices.add(eedit32);
        listOfPrices.add(eedit33);
        listOfPrices.add(eedit34);
        listOfPrices.add(eedit35);
        listOfPrices.add(eedit36);

        listOfItemCount.add(eeedit1);
        listOfItemCount.add(eeedit2);
        listOfItemCount.add(eeedit3);
        listOfItemCount.add(eeedit4);
        listOfItemCount.add(eeedit5);
        listOfItemCount.add(eeedit6);
        listOfItemCount.add(eeedit7);
        listOfItemCount.add(eeedit8);
        listOfItemCount.add(eeedit9);
        listOfItemCount.add(eeedit10);
        listOfItemCount.add(eeedit11);
        listOfItemCount.add(eeedit12);
        listOfItemCount.add(eeedit13);
        listOfItemCount.add(eeedit14);
        listOfItemCount.add(eeedit15);
        listOfItemCount.add(eeedit16);
        listOfItemCount.add(eeedit17);
        listOfItemCount.add(eeedit18);
        listOfItemCount.add(eeedit19);
        listOfItemCount.add(eeedit20);
        listOfItemCount.add(eeedit21);
        listOfItemCount.add(eeedit22);
        listOfItemCount.add(eeedit23);
        listOfItemCount.add(eeedit24);
        listOfItemCount.add(eeedit25);
        listOfItemCount.add(eeedit26);
        listOfItemCount.add(eeedit27);
        listOfItemCount.add(eeedit28);
        listOfItemCount.add(eeedit29);
        listOfItemCount.add(eeedit30);
        listOfItemCount.add(eeedit31);
        listOfItemCount.add(eeedit32);
        listOfItemCount.add(eeedit33);
        listOfItemCount.add(eeedit34);
        listOfItemCount.add(eeedit35);
        listOfItemCount.add(eeedit36);

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
        listOfText.add(text19);
        listOfText.add(text20);
        listOfText.add(text21);
        listOfText.add(text22);
        listOfText.add(text23);
        listOfText.add(text24);
        listOfText.add(text25);
        listOfText.add(text26);
        listOfText.add(text27);
        listOfText.add(text28);
        listOfText.add(text29);
        listOfText.add(text30);
        listOfText.add(text31);
        listOfText.add(text32);
        listOfText.add(text33);
        listOfText.add(text34);
        listOfText.add(text35);
        listOfText.add(text36);

        chList.add(check1);
        chList.add(check2);
        chList.add(check3);
        chList.add(check4);
        chList.add(check5);
        chList.add(check6);
        chList.add(check7);
        chList.add(check8);
        chList.add(check9);
        chList.add(check10);
        chList.add(check11);
        chList.add(check12);
        chList.add(check13);
        chList.add(check14);
        chList.add(check15);
        chList.add(check16);
        chList.add(check17);
        chList.add(check18);
        chList.add(check19);
        chList.add(check20);
        chList.add(check21);
        chList.add(check22);
        chList.add(check23);
        chList.add(check24);
        chList.add(check25);
        chList.add(check26);
        chList.add(check27);
        chList.add(check28);
        chList.add(check29);
        chList.add(check30);
        chList.add(check31);
        chList.add(check32);
        chList.add(check33);
        chList.add(check34);
        chList.add(check35);
        chList.add(check36);
        //endregion

        for (int i = 0; i < checkSaverArray.length; i++) {
            checkSaverArray[i] = false;
        }


        //region onClickListener///////////////////////////////////////////////////////
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.SetValueButton:
                        clickActivity(SettingActivity.class);
                        break;
                    case R.id.orderClearButton:
                        clearItAlert(v);
                        break;
                    case R.id.homeButton:
                        clickActivity(HomeActivity.class);
                        break;
                    case R.id.leftButton:
                        clickActivity(LeftActivity.class);
                        break;
                    case R.id.countButton:
                        ordersSumma = summator.sumOfLines(listOfPrices, listOfItemCount, listOfText);
                        moneyForBonusTotal.setText(String.valueOf(ordersSumma));
                        zeroPriceCount = juiceOrderedCount();
                        Log.e(LOGTAG, "zeroPriceCount: " + zeroPriceCount);
                        saveCheckStatus();
                        break;
                    case R.id.phonesButton:
                        okAlert(phonesText);
                        break;
                }
            }
        };
        //endregion

        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        phonesButton.setOnClickListener(listener);
    }

    private void clickActivity(Class c) {
        startActivity(new Intent(this, c));
    }

    @Override
    protected void onResume() {
        super.onResume();
        saveLoad.loadStringEditArray(listOfItems, oSettings1);
        saveLoad.loadStringEditArray(listOfPrices, oSettings2);
        saveLoad.loadStringEditArray(listOfItemCount, oSettings3);
        saveLoad.loadStringTViewArray(listOfText, oSettings4);
        //zeroPriceCount = saveLoad.loadInteger("j_c", oSettings6);


        ordersSumma = summator.sumOfLines(listOfPrices, listOfItemCount, listOfText);
        moneyForBonusTotal.setText(String.valueOf(ordersSumma));
        zeroPriceCount = juiceOrderedCount();

                loadCheckStatus();
    }

    @Override
    protected void onPause() {
        super.onPause();
        saveLoad.saveStringEditArray(listOfItems, oSettings1);
        saveLoad.saveStringEditArray(listOfPrices, oSettings2);
        saveLoad.saveStringEditArray(listOfItemCount, oSettings3);
        saveLoad.saveStringTViewArray(listOfText, oSettings4);
//        saveLoad.saveInteger(juiceOrderedCount(), "j_c", oSettings6);

        ordersSumma = summator.sumOfLines(listOfPrices, listOfItemCount, listOfText);
        moneyForBonusTotal.setText(String.valueOf(ordersSumma));

        zeroPriceCount = juiceOrderedCount();

        saveCheckStatus();
        Log.e(LOGTAG, "zeroPriceCount: " + zeroPriceCount);


        saveLoad.saveDouble(ordersSumma, "set7", prefForVar);
    }

    /*void resetValues() {

    }*/

    void saveCheckStatus() {
        int count = 0;
        for (CheckBox check : chList) {
            checkSaverArray[count] = check.isChecked();
            //То же самое что и:
            /*if (check.isChecked()) {
                checkSaverArray[count] = 1;
            } else {
                checkSaverArray[count] = 0;
            }*/
            count++;
        }
        saveLoad.saveBooleanArray(checkSaverArray, oSettings5);
    }

    int juiceOrderedCount() {
        return summator.sumOfZeroPrice(listOfPrices, listOfItemCount);
    }

    void loadCheckStatus() {
        saveLoad.loadBooleanArray(checkSaverArray, oSettings5);
        int count = 0;
        for (boolean b : checkSaverArray) {
            if(b){chList.get(count).setChecked(true);}
            count++;
        }

    }


    void uncheckAll() {
        for (CheckBox checkBox : chList) {
            checkBox.setChecked(false);
        }

    }

    public void clearItAlert (View view){
        final AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setMessage("Стереть всё?");
        alert.setIcon(R.drawable.ic_delete);

        alert.setPositiveButton("Гори оно огнём", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                uncheckAll();
                saveLoad.clearList(listOfItems, "");
                saveLoad.clearList(listOfPrices, "");
                saveLoad.clearList(listOfItemCount, "1");
                dialog.cancel();
            }
        });

        alert.setNegativeButton("нет", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.cancel();
            }
        });
        alert.show();
    }

    void okAlert(String message) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setMessage(message);

        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.cancel();
            }
        });

        alert.show();
    }

    void addDynamicView() {

    }

}