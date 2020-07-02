package com.example.a711;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class AfternoonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afternoon);

        TextView textView = findViewById(R.id.textViewAfternoon);
        textView.append("\n" + (new Date()).toString());

    }
}