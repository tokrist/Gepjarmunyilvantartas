package org.besttrio;

public class Owner {
    private int tulajdonosKod;
    private String nev;
    private String cim;

    public Owner(int tulajdonosKod, String nev, String cim) {
        this.tulajdonosKod = tulajdonosKod;
        this.nev = nev;
        this.cim = cim;
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
