package com.squorpikkor.app.magaz10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity);

        button1 = (Button) findViewById(R.id.homeButton);
        button2 = (Button) findViewById(R.id.leftButton);
        button3 = (Button) findViewById(R.id.countButton);

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
                        //
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
