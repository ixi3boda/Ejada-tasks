package com.ejada.practice.daythree.models;

/**
 * Thrown when an age value is outside the accepted range.
 */
public class InvalidAgeException extends Exception {
    /**
     * Creates a new exception with the provided message.
     *
     * @param message the error message
     */
    public InvalidAgeException(String message) {
        super(message);
    }
}
