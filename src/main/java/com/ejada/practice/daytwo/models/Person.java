package com.ejada.practice.daytwo.models;

/**
 * Represents a person with a name and age.
 */
public class Person {
    private String name;
    private int age;

    /**
     * Creates a person with default values.
     */
    public Person() {
        this("Unknown", 0);
    }

    /**
     * Creates a person with the specified name and age.
     *
     * @param name the person's name
     * @param age the person's age
     */
    public Person(String name, int age) {
        setName(name);
        setAge(age);
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
     * Sets the person's name after validating it.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        validateName(name);
        this.name = name;
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
     * Sets the person's age after validating it.
     *
     * @param age the age to set
     */
    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    private void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }

    private void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }
}
