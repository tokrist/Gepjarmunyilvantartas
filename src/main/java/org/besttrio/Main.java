package org.besttrio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void readVehicleFile(String fileName) {
        ArrayList<Vehicle> jarmuvek = new ArrayList<>();
        try {
            RandomAccessFile file = new RandomAccessFile(fileName, "r");
            String sor = file.readLine();
            sor = file.readLine();
            while(sor != null) {
                jarmuvek.add(new Vehicle(sor.split("\t")));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void readOwnerFile(String fileName) {
        ArrayList<Owner> tulajok = new ArrayList<>();
        try {
            RandomAccessFile file = new RandomAccessFile(fileName, "r");
            String sor = file.readLine();
            sor = file.readLine();
            while(sor != null) {
                tulajok.add(new Owner(sor.split("\t")));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {

    }
}