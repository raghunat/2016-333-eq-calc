package com.example.android.equationcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void calculate(View view) {
        EditText input1 = (EditText)findViewById(R.id.input1);
        System.out.println(input1.getText());
        // Start an intent to send them to the new activity
        Intent calculateIntent = new Intent(view.getContext(), ResultActivity.class);
        calculateIntent.putExtra("resultValue", input1.getText().toString());
        startActivity(calculateIntent);
    }
}
