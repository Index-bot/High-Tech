package com.hightech.miniweatherstation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity {

    private Button summary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        summary = (Button) findViewById(R.id.sum);
        summary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensummary();
            }
        });

    }

    public void opensummary () {
        Intent intent = new Intent(this, com.hightech.miniweatherstation.summary.class);
        startActivity(intent);
    }
}