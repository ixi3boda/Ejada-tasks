package com.ejada.practice.dayone.service;

import com.ejada.practice.dayone.models.Car;

/**
 * Entry point for the day one Java example.
 */
public class Main {
    public static void main(String[] args) {
        Car[] cars = createCars();
        printToyotaCheck(cars[0]);
        printModelCheck(cars[1]);
        printAllCars(cars);
    }

    private static Car[] createCars() {
        return new Car[]{
                new Car("Toyota", "Camry"),
                new Car("Honda", "Civic"),
                new Car("Ford", "Focus")
        };
    }

    private static void printToyotaCheck(Car car) {
        if ("Toyota".equals(car.getMake())) {
            System.out.println("car1 is a Toyota: " + car);
        } else {
            System.out.println("car1 is not a Toyota: " + car);
        }
    }

    private static void printModelCheck(Car car) {
        switch (car.getModel()) {
            case "Civic":
                System.out.println("car2 is a Civic");
                break;
            case "Accord":
                System.out.println("car2 is an Accord");
                break;
            default:
                System.out.println("car2 is another model: " + car.getModel());
        }
    }

    private static void printAllCars(Car[] cars) {
        System.out.println("All cars:");
        for (Car car : cars) {
            System.out.println("- " + car);
        }
    }
}
