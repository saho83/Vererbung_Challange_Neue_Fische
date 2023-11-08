package org.example;

public class Fahrzeug {

    // attribute
    String manufacturer;
    String model;
    int modelYear;

    // constructor
    public Fahrzeug() {

    }

    public Fahrzeug(String manufacturer, String model, int modelYear) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.modelYear = modelYear;
    }

    //method
    public void info() {
        System.out.println(manufacturer + " " + model + " " + modelYear);
    }

}
