package com.example.influencerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText email, password;
    Button login;
    String TAG="login button";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.et_email);
        password=findViewById(R.id.et_password);
        login=findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            System.out.println("Button Clicked");
            Intent intent=new Intent(getApplicationContext(),ProfileActivity.class);
            startActivity(intent);
            }
        });

    }



}
