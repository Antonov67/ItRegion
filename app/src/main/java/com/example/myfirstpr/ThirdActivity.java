package com.example.myfirstpr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView textView = findViewById(R.id.resultFromSecondActivity);
        String str = getIntent().getStringExtra("data");
        textView.setText(str);

    }
}