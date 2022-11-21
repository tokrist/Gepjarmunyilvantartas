package org.besttrio;

public class Vehicle {
    private String rendszam;
    private String marka;
    private String tipus;
    private int hengerurtartalom;
    private int ossztomeg;
    private int gyartas;
    private String alvazszam;
    private String motorszam;
    private int muszaki;
    private int tulajKod;

    public Vehicle(String [] be) {
        this.rendszam = be[0];
        this.marka = be[1];
        this.tipus = be[2];
        this.hengerurtartalom = Integer.parseInt(be[3]);
        this.ossztomeg = Integer.parseInt(be[4]);
        this.gyartas = Integer.parseInt(be[5]);
        this.alvazszam = be[6];
        this.motorszam = be[7];
        this.muszaki = Integer.parseInt(be[8]);
        this.tulajKod = Integer.parseInt(be[9]);
    }

    public String getRendszam() {
        return rendszam;
    }
    public String getMarka() {
        return marka;
    }
    public String getTipus() {
        return tipus;
    }
    public int getHengerurtartalom() {
        return hengerurtartalom;
    }
    public int getOssztomeg() {
        return ossztomeg;
    }
    public int getGyartas() {
        return gyartas;
    }
    public String getAlvazszam() {
        return alvazszam;
    }
    public int getMuszaki() {
        return muszaki;
    }
    public int getTulajKod() {
        return tulajKod;
    }
}