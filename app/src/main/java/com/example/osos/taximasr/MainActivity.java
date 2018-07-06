package com.example.osos.taximasr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.osos.taximasr.customer.Customer_registeration;
import com.example.osos.taximasr.driver.DriverLogin;

public class MainActivity extends AppCompatActivity {

    Button customer,driver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        customer=findViewById(R.id.customer);
        driver=findViewById(R.id.driver);

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Customer_registeration.class);
                startActivity(intent);
                finish();

            }
        });

        driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DriverLogin.class);
                startActivity(intent);
                finish();

            }
        });





    }
}
