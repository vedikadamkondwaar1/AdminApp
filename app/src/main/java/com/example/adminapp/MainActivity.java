package com.example.adminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread splash=new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(1*3000);
                    Intent intent = new Intent(getApplicationContext(),MainPage.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e)
                {

                }
            }
        };
        splash.start();
    }
}
