package com.example.influencerapp;

import android.widget.DatePicker;

import java.util.Date;

public class videodetails {

    private  String videoname;
    private  double earning;
    private String date;
    private DatePicker datePicker;
    private  String status;

    public videodetails(String videoname, double earning, String date, String status) {
        this.videoname = videoname;
        this.earning = earning;
        this.date=date;
        //this.datePicker = datePicker;
        this.status = status;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname;
    }

    public double getEarning() {
        return earning;
    }

    public void setEarning(double earning) {
        this.earning = earning;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public DatePicker getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        this.datePicker = datePicker;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}
