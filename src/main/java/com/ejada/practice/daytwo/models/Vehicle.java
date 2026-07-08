package com.ejada.practice.daytwo.models;

/**
 * Represents a generic vehicle with a brand and speed.
 */
public abstract class Vehicle {
    protected String brand;
    protected int speed;

    /**
     * Creates a vehicle with default values.
     */
    public Vehicle() {
        this("Unknown", 0);
    }

    /**
     * Creates a vehicle with the specified brand and speed.
     *
     * @param brand the vehicle brand
     * @param speed the vehicle speed in km/h
     */
    public Vehicle(String brand, int speed) {
        setBrand(brand);
        setSpeed(speed);
    }

    /**
     * Displays information about the vehicle.
     */
    public void displayInfo() {
        System.out.println("Brand: " + brand + " | Speed: " + speed + " km/h");
    }

    /**
     * Describes the vehicle type.
     */
    public void describeVehicle() {
        System.out.println("This is a general vehicle.");
    }

    /**
     * Returns the vehicle brand.
     *
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the vehicle brand after validating it.
     *
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        validateBrand(brand);
        this.brand = brand;
    }

    /**
     * Returns the vehicle speed.
     *
     * @return the speed in km/h
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the vehicle speed after validating it.
     *
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        validateSpeed(speed);
        this.speed = speed;
    }

    private void validateBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be empty.");
        }
    }

    private void validateSpeed(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("Speed cannot be negative.");
        }
    }
}
