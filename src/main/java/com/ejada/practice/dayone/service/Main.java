package com.ejada.practice.dayone.service;

import com.ejada.practice.dayone.enums.CarModel;
import com.ejada.practice.dayone.models.Car;

/**
 * Entry point for the day one Java example.
 */
public class Main {

    /**
     * Runs the sample car checks for the day one exercise.
     *
     * @param args command-line arguments passed to the program
     */
    public static void main(String[] args) {
        Car[] cars = createCars();
        printToyotaCheck(cars[0]);
        printModelCheck(cars[1]);
        printAllCars(cars);
    }

    /**
     * Creates a sample array of cars for demonstration purposes.
     *
     * @return an array of sample cars
     */
    private static Car[] createCars() {
        return new Car[]{
                new Car("Toyota", "Camry"),
                new Car("Honda", CarModel.CIVIC.getCode()),
                new Car("Ford", "Focus")
        };
    }

    /**
     * Prints whether the provided car is a Toyota.
     *
     * @param car the car to evaluate
     */
    private static void printToyotaCheck(Car car) {
        if ("Toyota".equals(car.getMake())) {
            System.out.println("car1 is a Toyota: " + car);
        } else {
            System.out.println("car1 is not a Toyota: " + car);
        }
    }

    /**
     * Prints a message based on the car model using the enum switch.
     *
     * @param car the car whose model should be checked
     */
    private static void printModelCheck(Car car) {
        CarModel model = CarModel.fromCode(car.getModel());
        if (model == null) {
            System.out.println("car2 is another model: " + car.getModel());
            return;
        }

        switch (model) {
            case CIVIC:
                System.out.println("car2 is a Civic");
                break;
            case ACCORD:
                System.out.println("car2 is an Accord");
                break;
            default:
                System.out.println("car2 is another model: " + car.getModel());
        }
    }

    /**
     * Prints every car in the provided array.
     *
     * @param cars the cars to print
     */
    private static void printAllCars(Car[] cars) {
        System.out.println("All cars:");
        for (Car car : cars) {
            System.out.println("- " + car);
        }
    }
}
