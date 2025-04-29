package com.example.testweek1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.AutoCompleteTextView;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.SlidingDrawer;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class AdvancedControlsActivity extends AppCompatActivity {

    private ListView listView;
    private Spinner spinner;
    private AutoCompleteTextView autoCompleteTextView;
    private GridView gridView;
    private Button backButton;
    private TimePicker timePicker;
    private SlidingDrawer slidingDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_controls);

        listView = findViewById(R.id.listView);
        String[] listData = {"Item 1", "Item 2", "Item 3", "Item 4"};
        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listData);
        listView.setAdapter(listAdapter);

        spinner = findViewById(R.id.spinner);
        String[] spinnerData = {"Option 1", "Option 2", "Option 3"};
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinnerData);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        String[] autoCompleteData = {"Apple", "Banana", "Cherry", "Date"};
        ArrayAdapter<String> autoCompleteAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, autoCompleteData);
        autoCompleteTextView.setAdapter(autoCompleteAdapter);

        gridView = findViewById(R.id.gridView);
        String[] gridData = {"Apple", "Banana", "Cherry", "Date"};
        ArrayAdapter<String> gridAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, gridData);
        gridView.setAdapter(gridAdapter);

        timePicker = findViewById(R.id.timePicker);
        timePicker.setIs24HourView(true);

        slidingDrawer = findViewById(R.id.slidingDrawer);

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.menu_item_1:
//                Toast.makeText(this, "Option 1 selected", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.menu_item_2:
//                Toast.makeText(this, "Option 2 selected", Toast.LENGTH_SHORT).show();
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
}

