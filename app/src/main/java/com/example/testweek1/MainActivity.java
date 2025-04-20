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

        // Gán các button với ID từ layout XML
        btnXmlLayout = findViewById(R.id.btnXmlLayout);
        btnCommonControls = findViewById(R.id.btnCommonControls);
        btnAdvancedControls = findViewById(R.id.btnAdvancedControls);
        btnAdapterDemo = findViewById(R.id.btnAdapterDemo);

        // Sự kiện click mở các activity tương ứng
        btnXmlLayout.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, XmlLayoutActivity.class)));

        btnCommonControls.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, CommonControlsActivity.class)));

        btnAdvancedControls.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, AdvancedControlsActivity.class)));

        btnAdapterDemo.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, AdapterDemoActivity.class)));
    }
}
