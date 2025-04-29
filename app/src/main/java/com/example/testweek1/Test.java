package com.example.testweek1;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Test extends AppCompatActivity {

    private TextView textViewExample;
    private Button buttonHi;
    private Button buttonBye;
    private Button buttonReset;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        textViewExample = findViewById(R.id.textView);
        buttonHi = findViewById(R.id.button);
        buttonBye = findViewById(R.id.button2);
        buttonReset = findViewById(R.id.button3);
        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            finish();
        });
        buttonHi.setOnClickListener(v -> {
            textViewExample.setText("Xin Chào!");
        });
        buttonBye.setOnClickListener(v -> {
            textViewExample.setText("Hẹn gặp lại!");
        });
        buttonReset.setOnClickListener(v -> {
            textViewExample.setText("");
        });
    }
}
