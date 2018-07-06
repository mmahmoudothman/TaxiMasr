package com.example.osos.taximasr.customer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.osos.taximasr.driver.DriverCostActivity;
import com.example.osos.taximasr.R;

public class CallDriver extends AppCompatActivity {

    Button startTrip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_driver);

        startTrip =findViewById(R.id.call_driver_btn);
        startTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CallDriver.this,DriverCostActivity.class);
                startActivity(i);
                finish();
            }
        });


    }
}
