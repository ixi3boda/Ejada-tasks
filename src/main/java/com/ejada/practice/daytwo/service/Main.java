package com.ejada.practice.daytwo.service;

import com.ejada.practice.daytwo.interfaces.Movable;
import com.ejada.practice.daytwo.models.Bike;
import com.ejada.practice.daytwo.models.Car;
import com.ejada.practice.daytwo.models.Person;
import com.ejada.practice.daytwo.models.Vehicle;

/**
 * Main class for the Java practice application.
 *
 * <p>This class demonstrates simple usage of inheritance, interface implementation,
 * lambda expressions, and object state updates.</p>
 */
public class Main {
    /**
     * Entry point for the application.
     *
     * <p>Creates sample vehicle and person objects, prints details, invokes
     * interface methods via lambda expressions, and updates object properties.</p>
     *
     * @param args command line arguments passed to the application
     */
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 120);
        Vehicle bike = new Bike("BMX", 60);

        System.out.println("Inheritance ");
        car.displayInfo();
        bike.displayInfo();
        car.describeVehicle();
        bike.describeVehicle();

        System.out.println("\nInterface with Lambda");
        Movable carMove = () -> System.out.println("Toyota car is driving on the road.");
        Movable bikeMove = () -> System.out.println("Honda bike is moving fast.");
        carMove.move();
        bikeMove.move();

        Vehicle vehicle = new Car("Tesla", 180);
        vehicle.displayInfo();
        vehicle.setBrand("BMW");
        vehicle.setSpeed(200);
        vehicle.displayInfo();

        Person person = new Person("Alice", 25);
        person.setAge(26);
        System.out.println("Person: " + person.getName() + " | Age: " + person.getAge());
    }
}
