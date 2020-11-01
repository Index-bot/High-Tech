package com.hightech.miniweatherstation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity {

    private Button summary;
    private Button dust;
    private Button temp;
    private Button hum;
    private Button light;
    private Button press;
    private Button uv;





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
        dust = (Button) findViewById(R.id.du);
        dust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendust();
            }
        });
        temp = (Button) findViewById(R.id.temp);
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentemp();
            }
        });
        hum = (Button) findViewById(R.id.humidity);
        hum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhum();
            }
        });
        light = (Button) findViewById(R.id.light);
        light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlight();
            }
        });
        press = (Button) findViewById(R.id.pression);
        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpress();
            }
        });
        uv = (Button) findViewById(R.id.uv);
        uv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openuv();
            }
        });
    }

    public void opensummary () {
        Intent intent = new Intent(this, com.hightech.miniweatherstation.summary.class);
        startActivity(intent);
    }
    public void opendust () {
        Intent intent = new Intent(this, com.hightech.miniweatherstation.dust.class);
        startActivity(intent);
    }
    public void opentemp () {
        Intent intent = new Intent(this, com.hightech.miniweatherstation.temp.class);
        startActivity(intent);
    }
    public void openhum () {
        Intent intent = new Intent(this, com.hightech.miniweatherstation.humidity.class);
        startActivity(intent);
    }
    public void openlight () {
        Intent intent = new Intent(this, com.hightech.miniweatherstation.light.class);
        startActivity(intent);
    }
    public void openpress () {
        Intent intent = new Intent(this, com.hightech.miniweatherstation.pression.class);
        startActivity(intent);
    }
    public void openuv () {
        Intent intent = new Intent(this, com.hightech.miniweatherstation.Uv.class);
        startActivity(intent);
    }
}