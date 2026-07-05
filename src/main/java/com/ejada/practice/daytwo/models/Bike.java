package com.ejada.practice.daytwo.models;

/**
 * Represents a bicycle.
 */
public class Bike extends Vehicle {
    /**
     * Creates a bike with default values.
     */
    public Bike() {
        this("Unknown", 0);
    }

    /**
     * Creates a bike with the specified brand and speed.
     *
     * @param brand the bike brand
     * @param speed the bike speed in km/h
     */
    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void describeVehicle() {
        System.out.println("This is a bike from " + brand + " with a top speed of " + speed + " km/h.");
    }
}
