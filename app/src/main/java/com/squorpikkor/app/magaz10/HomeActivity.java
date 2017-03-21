package com.squorpikkor.app.magaz10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;

import static com.squorpikkor.app.magaz10.OrderActivity.ordersSumma;
import static com.squorpikkor.app.magaz10.SettingActivity.totalOrderPrice;

public class HomeActivity extends AppCompatActivity {

    public static final String LOGTAG = "LOGGG!!!";



    Button button1, button2, button3, button4;

    EditTextSummator summator;

    EditText edit1, edit2, edit3, edit4, edit5, edit6, edit7, edit8, edit9, edit10,
            edit11, edit12, edit13, edit14, edit15, edit16, edit17, edit18, edit19,
            edit20, edit21, edit22, edit23, edit24, edit25, edit26, edit27, edit28;

    TextView textN, textJ;

    double[] dArray;

    ArrayList<EditText> listOfEdit1 = new ArrayList<>();
    ArrayList<EditText> listOfEdit2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        summator = new EditTextSummator();

        button1 = (Button) findViewById(R.id.SetValueButton);
        button2 = (Button) findViewById(R.id.leftButton);
        button3 = (Button) findViewById(R.id.orderButton);
        button4 = (Button) findViewById(R.id.countButton);

        textN = (TextView) findViewById(R.id.textN);
        textJ = (TextView) findViewById(R.id.textJ);


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
        //endregion

        /*double temp;
        Log.e(LOGTAG, "onRestoreInstanceState, ALL = " + savedInstanceState);

        if (savedInstanceState == null) {temp = 0;}
        else { temp = savedInstanceState.getDouble("saved");}
        Log.e(LOGTAG, "onRestoreInstanceState, temp = " + temp);

        edit1.setText(String.valueOf(temp));*/

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
                        textN.setText(String.valueOf(summator.sumOfLines(listOfEdit1, listOfEdit2)));
                        textJ.setText(String.valueOf(ordersSumma));
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

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onResume() {
        super.onResume();
        textN.setText(String.valueOf(totalOrderPrice));
    }

    /*protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putDouble("saved", Double.parseDouble(edit1.getText().toString()));
        outState.putInt("check", 777);
        Log.e(LOGTAG, "onSaveInstanceState, edit = " + edit1.getText().toString());
        Log.e(LOGTAG, "onSaveInstanceState, outState = " + outState.getBundle("saved"));
        Log.e(LOGTAG, "onSaveInstanceState, for check outState = " + outState);
        Log.e(LOGTAG, "onSaveInstanceState, for check outState = " + outState.getDouble("saved"));
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        double temp = savedInstanceState.getDouble("saved");
        edit1.setText(String.valueOf(temp));
        Log.e(LOGTAG, "onRestoreInstanceState");
    }*/


}
