package com.example.taimeasure;

public class Update {

    private String mmname;
    private String mmphone;
    private String mmbrindate;
    private String mmreturdate;

    public Update (String name, String phone, String brindate, String returdate){
        mmname = name; mmphone = phone;
        mmbrindate = brindate; mmreturdate = returdate;
    }

    public String getUpname(){return mmname;}
    public String getphone(){return mmphone;}
    public String getbrin(){return mmbrindate;}
    public String getretur(){return mmreturdate;}





}
