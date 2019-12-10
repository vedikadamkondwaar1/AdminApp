package com.example.adminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class CatAndProduct extends AppCompatActivity  implements
        AdapterView.OnItemSelectedListener{
    String[] country = { "CATEGORY", "VEGETABLE", "FRUITS"};
    Button buttonpro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_and_product);

       // buttoncat = findViewById(R.id.btncat);
        buttonpro = findViewById(R.id.btnpro);
        final Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);


        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);






    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if(position == 1) {
            buttonpro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(CatAndProduct.this, Product.class);
                    startActivity(i);

                }
            });
        }

        if(position == 2) {
            buttonpro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(CatAndProduct.this, FruitProduct.class);
                    startActivity(i);

                }
            });
        }


        Toast.makeText(getApplicationContext(),country[position] , Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
