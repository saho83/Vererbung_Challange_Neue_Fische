package org.example;

public class Motorrad extends Fahrzeug {

    // attribute
    int ps;
    String type;

    // constructor


    public Motorrad(int ps, String style) {
        this.ps = ps;
        this.type = style;
    }

    public Motorrad(String manufacturer, String model, int modelYear, int ps, String style) {
        super(manufacturer, model, modelYear);
        this.ps = ps;
        this.type = style;
    }

    // method
    public void typeOfStyle() {
        System.out.println("Type of Style: " + type);
    }












}
