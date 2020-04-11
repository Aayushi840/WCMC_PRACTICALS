package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;
    RelativeLayout r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        r = (RelativeLayout) findViewById(R.id.layout);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r.setBackgroundColor(Color.parseColor("#006400"));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r.setBackgroundColor(Color.parseColor("#FFFF00"));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r.setBackgroundColor(Color.parseColor("#0000ff"));
            }
        });
    }
}