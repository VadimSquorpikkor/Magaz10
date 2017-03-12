package com.squorpikkor.app.magaz10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LeftActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        button1 = (Button) findViewById(R.id.homeButton);
        button2 = (Button) findViewById(R.id.orderButton);
        button3 = (Button) findViewById(R.id.countButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.homeButton:
                        clickActivity(SettingActivity.class);
                        break;
                    case R.id.orderButton:
                        clickActivity(LeftActivity.class);
                        break;
                    case R.id.countButton:
                        clickActivity(OrderActivity.class);
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
