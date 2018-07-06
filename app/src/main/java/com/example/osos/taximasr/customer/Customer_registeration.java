package com.example.osos.taximasr.customer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.osos.taximasr.R;

public class Customer_registeration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_registeration);




      Button btn1=findViewById(R.id.btn_customer_sign_up);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Customer_registeration.this,Customer_Drawer.class);
                startActivity(intent);
                finish();

            }
        });

    }
}
