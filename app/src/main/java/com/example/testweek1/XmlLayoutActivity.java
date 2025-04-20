package com.example.testweek1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class XmlLayoutActivity extends AppCompatActivity {
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml_layout);

        // Gán Button Back
        btnBack = findViewById(R.id.btnBack);

        // Thiết lập sự kiện click cho nút Back
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kết thúc Activity hiện tại và quay lại Activity trước đó
                finish();
            }
        });
    }
}