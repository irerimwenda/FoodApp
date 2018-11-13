package com.example.ireribrian.foodapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import info.hoang8f.widget.FButton;

public class Splash extends AppCompatActivity {

    FButton btnRegister, btnLogin;
    TextView textSlogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        btnRegister = findViewById(R.id.btn_sign_up);
        btnLogin = findViewById(R.id.btn_sign_in);

        textSlogan = findViewById(R.id.text_slogan);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Nabila.ttf");
        textSlogan.setTypeface(typeface);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent loginIntent  = new Intent(Splash.this, Login.class);
                startActivity(loginIntent);

            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent registerIntent  = new Intent(Splash.this, Register.class);
                startActivity(registerIntent);

            }
        });


    }
}
