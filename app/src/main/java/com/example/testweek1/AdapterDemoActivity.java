package com.example.testweek1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AdapterDemoActivity extends AppCompatActivity {

    ListView listView;
    Button btnBack;
    String[] foods = {"Phở", "Bún chả", "Bánh mì", "Cơm tấm", "Chả cá", "Bún bò Huế"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_demo);

        listView = findViewById(R.id.listViewFoods);
        btnBack = findViewById(R.id.btnBack);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                foods
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            String food = foods[position];
            Toast.makeText(this, "Bạn chọn: " + food, Toast.LENGTH_SHORT).show();
        });

        btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}
