package com.example.flashlightapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;

public class MainActivity extends AppCompatActivity {

    Button onBtn,offBtn;
    Camera cam;
    Parameters p;
    boolean status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onBtn=(Button)findViewById(R.id.button2);
        offBtn=(Button)findViewById(R.id.button3);
        cam=Camera.open();
        final Camera.Parameters Param=cam.getParameters();
        offBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                offBtn.setVisibility(View.GONE);
                onBtn.setVisibility(View.VISIBLE);
                Param.setFlashMode(Parameters.FLASH_MODE_TORCH);
                cam.setParameters(Param);
                cam.startPreview();
            }
        });
        onBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBtn.setVisibility(View.GONE);
                offBtn.setVisibility(View.VISIBLE);
                Param.setFlashMode(Parameters.FLASH_MODE_OFF);
                cam.setParameters(Param);
                cam.startPreview();
            }
        });

    }
}
