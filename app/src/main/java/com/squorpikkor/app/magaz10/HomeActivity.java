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
import java.util.ArrayList;

import static com.squorpikkor.app.magaz10.OrderActivity.ordersSumma;
import static com.squorpikkor.app.magaz10.SettingActivity.totalJuiceCount;
import static com.squorpikkor.app.magaz10.SettingActivity.totalOrderPrice;

public class HomeActivity extends AppCompatActivity {

    public static final String LOGTAG = "LOGGG!!!";

    /*
    * Добавить на Settings активити строки: кол-во соков
    *                                       кол-во м соков
    *                                       кол во мол
    *                                       кол-во м мол
    *                                       сумма в накладной
    *                                       соков итого по заказам
    * */

    double mainTotalNakladnayaPrice = 0;
    double mainTotalJuicePrice = 0;
    double mainMoneyLeft = 0;
    public static double mainMoneyLeftForeach = 0;
    int mainOrderJuiceCount = 0;
    int mainJuiceWeGot = 0;

    SharedPreferences preferences1;
    SharedPreferences preferences2;
    SharedPreferences preferences3;
    SharedPreferences prefForVar;

    Button button1, button2, button3, button4;

    EditTextSummator summator;
    SaveLoad saveLoad = new SaveLoad();

    EditText edit1, edit2, edit3, edit4, edit5, edit6, edit7, edit8, edit9, edit10,
            edit11, edit12, edit13, edit14, edit15, edit16, edit17, edit18, edit19,
            edit20, edit21, edit22, edit23, edit24, edit25, edit26, edit27, edit28;

    TextView textN, textJ, textOst, textFE;

    ArrayList<EditText> listOfEdit1 = new ArrayList<>();
    ArrayList<EditText> listOfEdit2 = new ArrayList<>();
    ArrayList<TextView> listOfText = new ArrayList<>();

    boolean ActivityFirstRun;

//    double totalJuicePrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        preferences1 = getSharedPreferences("pref1", Context.MODE_PRIVATE);
        preferences2 = getSharedPreferences("pref2", Context.MODE_PRIVATE);
        preferences3 = getSharedPreferences("pref3", Context.MODE_PRIVATE);
        prefForVar = getSharedPreferences("prefForVar", Context.MODE_PRIVATE);

        summator = new EditTextSummator();

        button1 = (Button) findViewById(R.id.SetValueButton);
        button2 = (Button) findViewById(R.id.leftButton);
        button3 = (Button) findViewById(R.id.orderButton);
        button4 = (Button) findViewById(R.id.countButton);

        textN = (TextView) findViewById(R.id.textN);
        textJ = (TextView) findViewById(R.id.textJ);
        textOst = (TextView) findViewById(R.id.textOst);
        textFE = (TextView) findViewById(R.id.textFE);


        //region EDITTEXT FINDVIEW//////////////////////////////////////////////////////////////////////////
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
        //endregion

        //region ADD EDIT TO LIST//////////////////////////////////////////////////////////////////
        listOfEdit1.add(edit1);
        listOfEdit1.add(edit3);
        listOfEdit1.add(edit5);
        listOfEdit1.add(edit7);
        listOfEdit1.add(edit9);
        listOfEdit1.add(edit11);
        listOfEdit1.add(edit13);
        listOfEdit1.add(edit15);
        listOfEdit1.add(edit17);
        listOfEdit1.add(edit19);
        listOfEdit1.add(edit21);
        listOfEdit1.add(edit23);
        listOfEdit1.add(edit25);
        listOfEdit1.add(edit27);

        listOfEdit2.add(edit2);
        listOfEdit2.add(edit4);
        listOfEdit2.add(edit6);
        listOfEdit2.add(edit8);
        listOfEdit2.add(edit10);
        listOfEdit2.add(edit12);
        listOfEdit2.add(edit14);
        listOfEdit2.add(edit16);
        listOfEdit2.add(edit18);
        listOfEdit2.add(edit20);
        listOfEdit2.add(edit22);
        listOfEdit2.add(edit24);
        listOfEdit2.add(edit26);
        listOfEdit2.add(edit28);

        listOfText.add(textJ);
        listOfText.add(textN);
        listOfText.add(textOst);
        listOfText.add(textFE);
        //endregion

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.SetValueButton:
                        clickActivity(SettingActivity.class); break;
                    case R.id.leftButton:
                        clickActivity(LeftActivity.class); break;
                    case R.id.orderButton:
                        clickActivity(OrderActivity.class); break;
                    case R.id.countButton:
                        calculateVar();
                        displayVar();
                }
            }
        };

        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);

    }

    public void clickActivity(Class c) {
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }

    void calculateVar() {
        mainTotalNakladnayaPrice = totalOrderPrice;
        mainTotalJuicePrice = summator.sumOfLines(listOfEdit1, listOfEdit2);
        mainMoneyLeft = mainTotalNakladnayaPrice - mainTotalJuicePrice - ordersSumma;
        mainMoneyLeftForeach = mainMoneyLeft/(double)2;
        mainOrderJuiceCount = totalJuiceCount;
        mainJuiceWeGot = 0;
        mainJuiceWeGot = summator.intSumOfArray(listOfEdit2);
    }

    void saveVar() {
      saveLoad.saveDouble(mainTotalNakladnayaPrice, "set1", prefForVar);
      saveLoad.saveDouble(mainTotalJuicePrice, "set2", prefForVar);
      saveLoad.saveDouble(mainMoneyLeft, "set3", prefForVar);
      saveLoad.saveDouble(mainMoneyLeftForeach, "set4", prefForVar);
      saveLoad.saveInteger(mainOrderJuiceCount, "set5", prefForVar);
      saveLoad.saveInteger(mainJuiceWeGot, "set6", prefForVar);
    }

    void loadVar() {
        mainTotalNakladnayaPrice = saveLoad.loadDouble("set1", prefForVar);
        mainTotalJuicePrice = saveLoad.loadDouble("set2", prefForVar);
        mainMoneyLeft = saveLoad.loadDouble("set3", prefForVar);
        mainMoneyLeftForeach = saveLoad.loadDouble("set4", prefForVar);
        mainOrderJuiceCount = saveLoad.loadInteger("set5", prefForVar);
        mainJuiceWeGot = saveLoad.loadInteger("set6", prefForVar);
        Log.e(LOGTAG,"mainTotalNakladnayaPrice = " + mainTotalNakladnayaPrice);
        Log.e(LOGTAG,"mainTotalJuicePrice = " + mainTotalJuicePrice);
        Log.e(LOGTAG,"mainMoneyLeft = " + mainMoneyLeft);
        Log.e(LOGTAG,"mainMoneyLeftForeach = " + mainMoneyLeftForeach);
        Log.e(LOGTAG,"mainOrderJuiceCount = " + mainOrderJuiceCount);
        Log.e(LOGTAG,"mainJuiceWeGot = " + mainJuiceWeGot);
    }

    void displayVar() {
        textJ.setText(mainJuiceWeGot + " / " + totalJuiceCount);
        textN.setText(String.valueOf(mainTotalNakladnayaPrice));
        textOst.setText(String.valueOf(mainMoneyLeft));
        textFE.setText(String.valueOf(mainMoneyLeftForeach));
    }

    @Override
    protected void onPause() {
        super.onPause();
        saveLoad.saveStringEditArray(listOfEdit1, preferences1);
        saveLoad.saveStringEditArray(listOfEdit2, preferences2);
        saveLoad.saveStringTViewArray(listOfText, preferences3);
        saveVar();
    }

    @Override
    protected void onResume() {
        super.onResume();
        saveLoad.loadStringEditArray(listOfEdit1, preferences1);
        saveLoad.loadStringEditArray(listOfEdit2, preferences2);
        saveLoad.loadStringTViewArray(listOfText, preferences3);
        loadVar();
        calculateVar();
        displayVar();
    }



}
