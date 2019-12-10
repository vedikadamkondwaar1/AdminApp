package com.example.adminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adminapp.ui.home.HomeFragment;

import io.paperdb.Paper;

public class MainPage extends AppCompatActivity {
    public static final String PREFS_NAME = "MyPrefsFile";
    private static final String PREF_USERNAME = "savusername";
    private static final String PREF_PASSWORD = "savpassword";
    private String name,password;
    EditText username, pass;
    CheckBox checkB;


    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        username = findViewById(R.id.etLoginUsername);
        pass = findViewById(R.id.etLoginPassword);
        button = findViewById(R.id.btnLogin);
        checkB = findViewById(R.id.checkbox);
        Paper.init(this);

        name = username.getText().toString();
        password = pass.getText().toString();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username.getText().toString().equals("admin") &&
                         pass.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), HomePage.class);
                    startActivity(i);
                    finish();

                }else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

                }

                if(checkB.isChecked()){
                    getSharedPreferences(PREFS_NAME,MODE_PRIVATE).edit()
                            .putString(PREF_USERNAME,name).putString(PREF_PASSWORD,password).commit();
                }



            }
        });


    }


}
