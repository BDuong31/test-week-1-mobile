package com.example.testweek1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnXmlLayout, btnCommonControls, btnAdvancedControls, btnAdapterDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnXmlLayout = findViewById(R.id.btnXmlLayout);
        btnCommonControls = findViewById(R.id.btnCommonControls);
        btnAdvancedControls = findViewById(R.id.btnAdvancedControls);

        btnXmlLayout.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, register.class)));

        btnCommonControls.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, login.class)));

        btnAdvancedControls.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, AppointmentActivity.class)));
    }
}
