package org.example;

public class Auto extends Fahrzeug{


    // attribute
    int numberOfDoors;

    // constructor
    public Auto(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Auto(String manufacturer, String model, int modelYear, int numberOfDoors) {
        super(manufacturer, model, modelYear);
        this.numberOfDoors = numberOfDoors;
    }



    // method
    @Override
    public void info() {
        super.info();
        System.out.println(numberOfDoors);
    }


    @Override
    public String toString() {
        return "Auto{" +
                "numberOfDoors=" + numberOfDoors +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }







}
