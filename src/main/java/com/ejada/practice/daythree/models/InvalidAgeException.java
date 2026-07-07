package com.ejada.practice.daythree.models;

import com.ejada.practice.daythree.enums.Error;

/**
 * Thrown when an age value is outside the accepted range.
 */
public class InvalidAgeException extends IllegalArgumentException {
    /**
     * Creates a new exception using the shared age validation error.
     */
    public InvalidAgeException() {
        super(Error.INVALID_AGE.getMessage());
    }
}
