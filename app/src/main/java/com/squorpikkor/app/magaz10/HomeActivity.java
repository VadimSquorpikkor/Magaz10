package com.squorpikkor.app.magaz10;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);



        button1 = (Button) findViewById(R.id.SetValueButton);
        button2 = (Button) findViewById(R.id.leftButton);
        button3 = (Button) findViewById(R.id.orderButton);
        button4 = (Button) findViewById(R.id.countButton);
        edit1 = (EditText) findViewById(R.id.edit1);

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
    }

    public void clickActivity(Class c) {
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
}
