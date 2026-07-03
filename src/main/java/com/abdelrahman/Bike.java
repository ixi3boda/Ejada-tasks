package com.abdelrahman;

public class Bike extends Vehicle {
    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void describeVehicle() {
        System.out.println("This is a bike from " + brand + " with a top speed of " + speed + " km/h.");
    }
}
