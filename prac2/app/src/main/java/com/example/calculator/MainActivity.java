package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtData1,txtData2;
    float num1,num2,result1,result2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = (Button) findViewById(R.id.button1);
        add.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                try {
                    txtData1 = (EditText) findViewById(R.id.edittext1);
                    txtData2 = (EditText) findViewById(R.id.edittext2);
                    num1 = Float.parseFloat(txtData1.getText().toString());
                    num2 = Float.parseFloat(txtData2.getText().toString());
                    result1 = num1 + num2;
                    Toast.makeText(getBaseContext(), "ANSWER:" + result1, Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getBaseContext(), e.getMessage(),
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}