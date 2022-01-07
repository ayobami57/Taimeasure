package com.example.taimeasure;

public class Declare {
    private String mmName;
    private String mmBack;
    private String mmSleeve;
    private String mmRoundSleeve;
    private String mmWaist;
    private String mmChest;
    private String mmSlimwaist;
    private String mmToplength;
    private String mmTight;
    private String mmTrouserlength;
    private String mmAnkle;


    public Declare (String Back, String Sleeve, String Roundsleeve, String Waist, String Chest, String Slimwaist, String Toplength,
                    String Tight, String Trouserlength, String Ankle, String Name) {
        mmBack = Back;
        mmSleeve = Sleeve; mmRoundSleeve = Roundsleeve;
        mmWaist = Waist; mmSlimwaist = Slimwaist;
        mmChest = Chest; mmToplength = Toplength;
        mmTight = Tight; mmTrouserlength = Trouserlength;
        mmAnkle = Ankle; mmName = Name;

    }

    public String getName1(){return mmName;}
    public String getBack1(){return mmBack;}
    public String getSleeve1(){return mmSleeve;}
    public String getRoundsleeve1(){return mmRoundSleeve;}
    public String getWaist1(){return mmWaist;}
    public String getChest1(){return mmChest;}
    public String getSlimwaist1(){return mmSlimwaist;}
    public String getToplength1(){return mmToplength;}
    public String getTight1(){return mmTight;}
    public String getTrouserlength1(){return mmTrouserlength;}
    public String getAnkle1(){return mmAnkle;}
}
