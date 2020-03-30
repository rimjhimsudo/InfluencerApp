package com.example.influencerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn,btn1;
 @Override
    protected void onCreate(Bundle savedInstanceState){
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_profile);

     getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    btn=findViewById(R.id.nextbtn);
    btn1=findViewById(R.id.nextbtn1);
    btn.setOnClickListener(this);
    btn1.setOnClickListener(this);
}
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.nextbtn){
            Intent intent=new Intent(getApplicationContext(), VideoDetailsActivity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.nextbtn1){
            Intent intent=new Intent(getApplicationContext(),SubmitActivity.class);
            startActivity(intent);
        }

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

     switch (item.getItemId()){
         case android.R.id.home:
             finish();
             return true;
     }

     return super.onOptionsItemSelected(item);

    }
}
