package com.example.adminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Payment extends AppCompatActivity {
    Button btnprofit, btnExpence, btnVender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        btnprofit=findViewById(R.id.venProfit);
        btnExpence = findViewById(R.id.venExp);
        btnVender = findViewById(R.id.venpay);
        btnprofit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Payment.this,Profit.class);
                startActivity(i);
            }
        });

        btnExpence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Payment.this,Expence.class);
                startActivity(i);
            }
        });

        btnVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Payment.this,VenPay.class);
                startActivity(i);
            }
        });


    }
}
