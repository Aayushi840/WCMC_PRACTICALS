package com.example.spinnertoastmessage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;
import android.widget.Toast;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    private Chronometer timer;
    int i=-1;
    int duration=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer=(Chronometer)findViewById(R.id.chronometer);
        timer.start();
        timer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                i++;
                if (i >= duration) {
                    Toast.makeText(MainActivity.this, "17IT103 Aayushi Shah - " + (i / 5), Toast.LENGTH_LONG).show();
                    duration = duration + 5;


                }
            }
        });
    }
}

