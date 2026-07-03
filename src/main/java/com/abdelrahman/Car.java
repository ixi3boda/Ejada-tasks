package com.abdelrahman;

public class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void describeVehicle() {
        System.out.println("This is a car from " + brand + " with a top speed of " + speed + " km/h.");
    }
}
