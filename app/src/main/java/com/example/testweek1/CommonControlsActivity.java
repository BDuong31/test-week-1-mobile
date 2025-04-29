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

public class CommonControlsActivity extends AppCompatActivity {

    private TextView textViewExample;
    private EditText editTextExample;
    private ImageView imageViewExample;
    private WebView webViewExample;
    private Button buttonExample;
    private RadioGroup radioGroupExample;
    private CheckBox checkBoxExample;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_controls);

        textViewExample = findViewById(R.id.textViewExample);
        editTextExample = findViewById(R.id.editTextExample);
        imageViewExample = findViewById(R.id.imageViewExample);
        webViewExample = findViewById(R.id.webViewExample);
        buttonExample = findViewById(R.id.buttonExample);
        radioGroupExample = findViewById(R.id.radioGroupExample);
        checkBoxExample = findViewById(R.id.checkBoxExample);
        backButton = findViewById(R.id.backButton);

        WebView webView = findViewById(R.id.webViewExample);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://youthscience.club/");

        buttonExample.setOnClickListener(v -> {
            textViewExample.setText("Button clicked!");
        });

        radioGroupExample.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radioOption1) {
                    textViewExample.setText("Option 1 selected");
            } else if (checkedId == R.id.radioOption2) {
                    textViewExample.setText("Option 2 selected");
            }
        });

        checkBoxExample.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                textViewExample.setText("Checkbox is checked");
            } else {
                textViewExample.setText("Checkbox is unchecked");
            }
        });

        backButton.setOnClickListener(v -> {
            finish();
        });
    }
}
