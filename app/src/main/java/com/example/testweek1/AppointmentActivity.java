package com.example.testweek1;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class AppointmentActivity extends AppCompatActivity {

    private EditText edtNgayKham;
    private ImageView imgCalendar;
    private EditText reasonEditText;
    private Button customButton;
    private RadioGroup radioGroup;
    private RadioButton radioServiceNormal, radioServiceAfterHours;
    private TextView priceText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointment);

        // Initializing views
        edtNgayKham = findViewById(R.id.edtNgayKham);
        imgCalendar = findViewById(R.id.imgCalendar);
        reasonEditText = findViewById(R.id.reason_edit_text);
        customButton = findViewById(R.id.custom_button);
        radioGroup = findViewById(R.id.radio_group);
        radioServiceNormal = findViewById(R.id.radio_service_normal);
        radioServiceAfterHours = findViewById(R.id.radio_service_after_hours);
        priceText = findViewById(R.id.type);
        ImageView imgBack = findViewById(R.id.imgBack);

        imgBack.setOnClickListener(v -> {
            onBackPressed();
        });
        imgCalendar.setOnClickListener(v -> showDatePickerDialog());

        customButton.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int minute = calendar.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    (view, hourOfDay, minute1) -> {
                        String formattedTime = String.format("%02d:%02d", hourOfDay, minute1);
                        customButton.setText(formattedTime); // <-- SET GIỜ vào Button
                    },
                    hour,
                    minute,
                    true // dùng 24h format
            );

            timePickerDialog.show();
        });


        radioGroup.setOnCheckedChangeListener((group, checkedId) -> updatePriceDisplay(checkedId));
        radioServiceNormal.setOnClickListener(v -> {
            radioServiceNormal.setChecked(true);
            radioServiceAfterHours.setChecked(false);
            updatePriceDisplay(R.id.radio_service_normal);
        });

        radioServiceAfterHours.setOnClickListener(v -> {
            radioServiceNormal.setChecked(false);
            radioServiceAfterHours.setChecked(true);
            updatePriceDisplay(R.id.radio_service_after_hours);
        });
    }

    // Function to show DatePickerDialog
    private void showDatePickerDialog() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                (view, year1, month1, dayOfMonth1) -> edtNgayKham.setText(dayOfMonth1 + "/" + (month1 + 1) + "/" + year1),
                year, month, dayOfMonth);

        datePickerDialog.show();
    }

    // Function to update price based on selected radio button
    private void updatePriceDisplay(int checkedId) {
        if (checkedId == R.id.radio_service_normal) {
            priceText.setText("100.000đ");

        } else if (checkedId == R.id.radio_service_after_hours) {
            priceText.setText("200.000đ");
        }
    }
}
