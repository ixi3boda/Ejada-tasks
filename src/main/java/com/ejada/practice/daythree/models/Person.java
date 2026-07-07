package com.ejada.practice.daythree.models;

import java.util.Objects;

/**
 * Represents a person with a name and age.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    /**
     * Creates a new person with default values.
     */
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    /**
     * Creates a new person with the provided name and age.
     *
     * @param name the person's name
     * @param age the person's age, must be between 0 and 100
     * @throws InvalidNameException if the name is blank
     * @throws InvalidAgeException if the age is out of range
     */
    public Person(String name, int age) {
        this();
        validateName(name);
        validateAge(age);
        this.name = name;
        this.age = age;
    }

    /**
     * Validates the provided name.
     *
     * @param name the name to validate
     * @throws InvalidNameException if the name is blank
     */
    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new InvalidNameException();
        }
    }

    /**
     * Validates the provided age.
     *
     * @param age the age to validate
     * @throws InvalidAgeException if the age is out of range
     */
    private void validateAge(int age) {
        if (age < 0 || age > 100) {
            throw new InvalidAgeException();
        }
    }

    /**
     * Sets the person's name.
     *
     * @param name the new name
     * @throws InvalidNameException if the name is blank
     */
    public void setName(String name) {
        validateName(name);
        this.name = name;
    }

    /**
     * Sets the person's age.
     *
     * @param age the new age
     * @throws InvalidAgeException if the age is out of range
     */
    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    /**
     * Returns the person's name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the person's age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Compares this person with another person by age.
     *
     * @param other the other person
     * @return a negative integer, zero, or positive integer depending on age comparison
     */
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    /**
     * Checks whether this person is equal to another object.
     *
     * @param object the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Person person = (Person) object;
        return age == person.age && Objects.equals(name, person.name);
    }

    /**
     * Returns a hash code for this person.
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * Returns a string representation of this person.
     *
     * @return the formatted person details
     */
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
