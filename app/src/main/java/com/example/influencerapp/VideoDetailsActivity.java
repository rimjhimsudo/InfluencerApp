package com.example.influencerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class VideoDetailsActivity extends AppCompatActivity {
    List<videodetails> vdlist;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_details);
        //getActionBar().setDisplayShowHomeEnabled(true);
        recyclerView=findViewById(R.id.recylerview);
        //recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initialising list
        vdlist=new ArrayList<>();

        //adding items
        vdlist.add(
                new videodetails("largest water park 1", 5500,"2020-01-01" ,"access"));
        vdlist.add(
                new videodetails("largest water park 2 ", 5500,"2020-01-01" ,"denied"));
        vdlist.add(
                new videodetails("largest water park 3", 5500,"2020-01-01" ,"access"));
        vdlist.add(
                new videodetails("largest water park 4", 5500,"2020-01-01" ,"denied"));
        vdlist.add(
                new videodetails("largest water park 5", 5500,"2020-01-01" ,"denied"));
        vdlist.add(
                new videodetails("largest water park 6", 5500,"2020-01-01" ,"denied"));
        vdlist.add(
                new videodetails("largest water park 7", 5500,"2020-01-01" ,"denied"));
        vdlist.add(
                new videodetails("largest water park 8", 5500,"2020-01-01" ,"access"));
        vdlist.add(
                new videodetails("largest water park 9", 5500,"2020-01-01" ,"denied"));
        vdlist.add(
                new videodetails("largest water park 10", 5500,"2020-01-01" ,"access"));
        vdlist.add(
                new videodetails("largest water park 11", 5500,"2020-01-01" ,"access"));
        vdlist.add(
                new videodetails("largest water park 12", 5500,"2020-01-01" ,"denied"));
        vdlist.add(
                new videodetails("largest water park 13", 5500,"2020-01-01" ,"access"));
        vdlist.add(
                new videodetails("largest water park 14", 5500,"2020-01-01" ,"access"));

        VideoAdapter adapter=new VideoAdapter(this,vdlist);
        recyclerView.setAdapter(adapter);
    }




}

