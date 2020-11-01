package com.hightech.miniweatherstation;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button ins;
    private Button login;
    private EditText umail;
    private EditText password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ins = (Button) findViewById(R.id.ins);
        ins.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                openinscription();

            }
        });
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlogin();
            }
        });






    }

    public void openinscription() {
        Intent intent = new Intent(this, inscription.class);
        startActivity(intent);
    }
    public void openlogin () {
        Intent intent = new Intent(this, dashboard.class);
        startActivity(intent);
    }




}