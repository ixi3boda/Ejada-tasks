package com.ejada.practice.dayone.models;

/**
 * Represents a car with make and model information.
 */
public class Car {

    private String make;
    private String model;

    /**
     * Default constructor.
     */
    public Car() {
        this.make = null;
        this.model = null;
    }

    /**
     * Creates a car with the specified make and model.
     *
     * @param make the manufacturer of the car
     * @param model the model name of the car
     */
    public Car(String make, String model) {
        setMake(make);
        setModel(model);
    }

    /**
     * Returns the car make.
     *
     * @return the car make
     */
    public String getMake() {
        return make;
    }

    /**
     * Returns the car model.
     *
     * @return the car model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the car make.
     *
     * @param make the manufacturer of the car
     */
    public void setMake(String make) {
        validateMake(make);
        this.make = make;
    }

    /**
     * Sets the car model.
     *
     * @param model the model name of the car
     */
    public void setModel(String model) {
        validateModel(model);
        this.model = model;
    }

    private void validateMake(String make) {
        if (make == null || make.trim().isEmpty()) {
            throw new IllegalArgumentException("Make cannot be null or blank.");
        }
    }

    private void validateModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or blank.");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
