package com.example.osos.taximasr.driver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.osos.taximasr.R;

public class DriverCommunicateWithCustomer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communicate_with_customer);



        Button button = findViewById(R.id.btn_communocated_with_customer);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DriverCommunicateWithCustomer.this,DriverCommunicateAcivity.class);
                startActivity(intent);
            }
        });



    }
}
