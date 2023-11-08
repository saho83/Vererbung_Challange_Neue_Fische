package org.example;

public class Main {
    public static void main(String[] args) {


        Fahrzeug test = new Fahrzeug("Audi", "A4", 1999);
        test.info();

        System.out.println("_____________________");

        Auto auto1 = new Auto("BMW", "E36", 1989, 2 );
        auto1.info();
        System.out.println(auto1.toString());

        System.out.println("______________________");

        Motorrad moped = new Motorrad(90,"Chopper");
        moped.typeOfStyle();



    }
}