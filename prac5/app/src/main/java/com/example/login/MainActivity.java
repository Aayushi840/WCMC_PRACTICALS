package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.login.R;

public class MainActivity extends AppCompatActivity {
    TextView failed;
    EditText usname,pass;
    Button login, cancel;

    public p5() {
        // Required empty public constructor
    }

    public static p5 newInstance(String param1, String param2) {
        p5 fragment = new p5();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View header = inflater.inflate(R.layout.fragment_p5, container, false);

        failed = header.findViewById(R.id.p5_fail);
        usname = header.findViewById(R.id.p5_username);
        pass = header.findViewById(R.id.p5_password);
        login = header.findViewById(R.id.p5_login);
        cancel = header.findViewById(R.id.p5_cancel);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!usname.getText().toString().isEmpty() && !pass.getText().toString().isEmpty()){
                    Intent intent = new Intent(getContext(), p5_1.class);
                    intent.putExtra("text",usname.getText().toString());
                    startActivity(intent);
                }else {
                    failed.setText("Please enter valid Username or Password.");
                    failed.setBackgroundColor(Color.parseColor("#FFCBA4"));
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        return header;
    }
}