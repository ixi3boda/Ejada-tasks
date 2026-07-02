package com.abdelrahmanessam;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("Ford", "Focus");

        if ("Toyota".equals(car1.getMake())) {
            System.out.println("car1 is a Toyota: " + car1);
        } else {
            System.out.println("car1 is not a Toyota: " + car1);
        }

        switch (car2.getModel()) {
            case "Civic":
                System.out.println("car2 is a Civic");
                break;
            case "Accord":
                System.out.println("car2 is an Accord");
                break;
            default:
                System.out.println("car2 is another model: " + car2.getModel());
        }

        Car[] cars = new Car[]{car1, car2, car3};
        System.out.println("All cars:");
        for (Car c : cars) {
            System.out.println("- " + c);
        }
    }
}
