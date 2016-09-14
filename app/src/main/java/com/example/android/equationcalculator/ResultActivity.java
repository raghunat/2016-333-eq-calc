package com.example.android.equationcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        String resultValue = getIntent().getExtras().getString("resultValue");
        Button backButton = (Button) findViewById(R.id.back_button);
        backButton.setText(resultValue + " " + backButton.getText());
    }

    protected void goBack (View view) {
        Intent intent = new Intent();
        setResult(RESULT_OK, intent);
        finish();
    }
}
