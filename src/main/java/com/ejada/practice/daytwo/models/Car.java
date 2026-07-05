package com.ejada.practice.daytwo.models;

/**
 * Represents a car.
 */
public class Car extends Vehicle {
    /**
     * Creates a car with default values.
     */
    public Car() {
        this("Unknown", 0);
    }

    /**
     * Creates a car with the specified brand and speed.
     *
     * @param brand the car brand
     * @param speed the car speed in km/h
     */
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void describeVehicle() {
        System.out.println("This is a car from " + brand + " with a top speed of " + speed + " km/h.");
    }
}
