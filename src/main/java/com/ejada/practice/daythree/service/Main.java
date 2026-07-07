package com.ejada.practice.daythree.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.ejada.practice.daythree.models.InvalidAgeException;
import com.ejada.practice.daythree.models.InvalidNameException;
import com.ejada.practice.daythree.models.Person;
import com.ejada.practice.daythree.models.Product;

/**
 * Demonstrates Java practice examples for the day three package.
 */
public class Main {
    /**
     * Runs the Java practice examples for the day three session.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Java practice examples");
        TryCatchAndUserInput();
        Collections();
        Streams();
        ModernJava();
    }

    /**
     * Demonstrates try-catch handling with custom validation exceptions.
     */
    private static void TryCatchAndUserInput() {
        System.out.println("\n1) try-catch, custom exception, and user input");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");

        try {
            String input = scanner.nextLine();
            int age = Integer.parseInt(input);
            Person person = new Person(name, age);
            System.out.println("Valid person: " + person);
        } catch (NumberFormatException exception) {
            System.out.println("That is not a valid integer. " + exception.getMessage());
        } catch (InvalidNameException exception) {
            System.out.println("Custom name exception: " + exception.getMessage());
        } catch (InvalidAgeException exception) {
            System.out.println("Custom age exception: " + exception.getMessage());
        } catch (Exception exception) {
            System.out.println("Unexpected error: " + exception.getMessage());
        } finally {
            System.out.println("Input check completed.");
        }
    }

    /**
     * Demonstrates collections, sorting, and ordering examples.
     */
    private static void Collections() {
        System.out.println("\n2) Collections and ordering");

        List<Person> people = new ArrayList<>(List.of(
                new Person("Ali", 22),
                new Person("Mohamed", 19),
                new Person("Anwar", 25)
        ));

        people.sort(Comparator.comparing(Person::getName));
        System.out.println("Sorted by name: " + people);

        Collections.sort(people, Comparator.comparingInt(Person::getAge).reversed());
        System.out.println("Sorted by age descending: " + people);

        Set<String> cities = new LinkedHashSet<>(List.of("Cairo", "Alexandria", "Cairo"));
        System.out.println("Unique cities: " + cities);

        Map<String, Integer> scores = new LinkedHashMap<>();
        scores.put("Java", 90);
        scores.put("SQL", 88);
        scores.put("Spring", 92);
        System.out.println("Scores map: " + scores);

        List<Person> comparablePeople = new ArrayList<>(List.of(
                new Person("Omar", 28),
                new Person("Ahmed", 31),
                new Person("Abdelrahman", 24)
        ));
        comparablePeople.sort(null);
        System.out.println("Comparable example: " + comparablePeople);
    }

    /**
     * Demonstrates stream API usage.
     */
    private static void Streams() {
        System.out.println("\n3) Stream API examples");

        List<Integer> numbers = Arrays.asList(3, 7, 1, 9, 4, 6);
        List<Integer> evenSquares = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .sorted()
                .toList();

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Even squares: " + evenSquares);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    /**
     * Demonstrates modern Java language features.
     */
    private static void ModernJava() {
        System.out.println("\n4) Modern Java features");

        var product = new Product("Laptop", 1499.99);
        var productName = product.name();
        var names = List.of("A", "B", "C");

        System.out.println("Record product: " + product);
        System.out.println("Product name using var: " + productName);
        System.out.println("Newer syntax example: " + names);
    }
}
