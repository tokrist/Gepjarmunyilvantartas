package org.besttrio;

public class Owner {
    private int tulajdonosKod;
    private String nev;
    private String cim;

    public Owner(String [] be) {
        this.tulajdonosKod = Integer.parseInt(be[0]);
        this.nev = be[1];
        this.cim = be[2];
    }

    public int getTulajdonosKod() {
        return tulajdonosKod;
    }
    public String getNev() {
        return nev;
    }
    public String getCim() {
        return cim;
    }

}
