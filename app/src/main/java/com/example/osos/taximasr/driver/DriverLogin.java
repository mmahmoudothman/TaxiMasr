package com.example.osos.taximasr.driver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.osos.taximasr.R;
import com.example.osos.taximasr.customer.PostCode;

public class DriverLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.driver_login);


        Button button = findViewById(R.id.btm_maps);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DriverLogin.this,PostCode.class);
                startActivity(intent);
            }
        });

    }
}
