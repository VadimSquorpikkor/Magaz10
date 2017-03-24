package com.squorpikkor.app.magaz10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.app.PendingIntent.getActivity;

public class OrderActivity extends AppCompatActivity {

    SharedPreferences oSettings1;
    SharedPreferences oSettings2;
    SharedPreferences oSettings3;
    SharedPreferences oSettings4;

    public static final String LOGTAG = "LOGGG!!!";

    Button button1, button2, button3;

    public static double ordersSumma;

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

    TextView moneyForBonusTotal;

    ArrayList<EditText> listOfEdit1 = new ArrayList<>();
    ArrayList<EditText> listOfEdit2 = new ArrayList<>();
    ArrayList<EditText> listOfEdit3 = new ArrayList<>();
    ArrayList<TextView> listOfText = new ArrayList<>();

    EditTextSummator summator;
    SaveLoad saveLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity);

        oSettings1 = getSharedPreferences("orderSettings1", Context.MODE_PRIVATE);
        oSettings2 = getSharedPreferences("orderSettings2", Context.MODE_PRIVATE);
        oSettings3 = getSharedPreferences("orderSettings3", Context.MODE_PRIVATE);
        oSettings4 = getSharedPreferences("orderSettings4", Context.MODE_PRIVATE);

        summator = new EditTextSummator();
        saveLoad = new SaveLoad();

        button1 = (Button) findViewById(R.id.homeButton);
        button2 = (Button) findViewById(R.id.leftButton);
        button3 = (Button) findViewById(R.id.countButton);

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
        listOfEdit1.add(edit19);
        listOfEdit1.add(edit20);
        listOfEdit1.add(edit21);
        listOfEdit1.add(edit22);
        listOfEdit1.add(edit23);
        listOfEdit1.add(edit24);
        listOfEdit1.add(edit25);
        listOfEdit1.add(edit26);
        listOfEdit1.add(edit27);
        listOfEdit1.add(edit28);
        listOfEdit1.add(edit29);
        listOfEdit1.add(edit30);
        listOfEdit1.add(edit31);
        listOfEdit1.add(edit32);
        listOfEdit1.add(edit33);
        listOfEdit1.add(edit34);
        listOfEdit1.add(edit35);
        listOfEdit1.add(edit36);

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
        listOfEdit2.add(eedit19);
        listOfEdit2.add(eedit20);
        listOfEdit2.add(eedit21);
        listOfEdit2.add(eedit22);
        listOfEdit2.add(eedit23);
        listOfEdit2.add(eedit24);
        listOfEdit2.add(eedit25);
        listOfEdit2.add(eedit26);
        listOfEdit2.add(eedit27);
        listOfEdit2.add(eedit28);
        listOfEdit2.add(eedit29);
        listOfEdit2.add(eedit30);
        listOfEdit2.add(eedit31);
        listOfEdit2.add(eedit32);
        listOfEdit2.add(eedit33);
        listOfEdit2.add(eedit34);
        listOfEdit2.add(eedit35);
        listOfEdit2.add(eedit36);

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
        listOfEdit3.add(eeedit19);
        listOfEdit3.add(eeedit20);
        listOfEdit3.add(eeedit21);
        listOfEdit3.add(eeedit22);
        listOfEdit3.add(eeedit23);
        listOfEdit3.add(eeedit24);
        listOfEdit3.add(eeedit25);
        listOfEdit3.add(eeedit26);
        listOfEdit3.add(eeedit27);
        listOfEdit3.add(eeedit28);
        listOfEdit3.add(eeedit29);
        listOfEdit3.add(eeedit30);
        listOfEdit3.add(eeedit31);
        listOfEdit3.add(eeedit32);
        listOfEdit3.add(eeedit33);
        listOfEdit3.add(eeedit34);
        listOfEdit3.add(eeedit35);
        listOfEdit3.add(eeedit36);

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
        //endregion

        //region onClickListener///////////////////////////////////////////////////////
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
                        ordersSumma = summator.sumOfLines(listOfEdit2, listOfEdit3, listOfText);
                        moneyForBonusTotal.setText(String.valueOf(ordersSumma));
                        break;
                }
            }
        };
        //endregion

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
        saveLoad.loadStringEditArray(listOfEdit1, oSettings1);
        saveLoad.loadStringEditArray(listOfEdit2, oSettings2);
        saveLoad.loadStringEditArray(listOfEdit3, oSettings3);
        saveLoad.loadStringTViewArray(listOfText, oSettings4);
    }

    @Override
    protected void onPause() {
        super.onPause();
        saveLoad.saveStringEditArray(listOfEdit1, oSettings1);
        saveLoad.saveStringEditArray(listOfEdit2, oSettings2);
        saveLoad.saveStringEditArray(listOfEdit3, oSettings3);
        saveLoad.saveStringTViewArray(listOfText, oSettings4);
    }


}
