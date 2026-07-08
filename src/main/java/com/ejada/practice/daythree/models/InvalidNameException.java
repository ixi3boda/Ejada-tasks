package com.ejada.practice.daythree.models;

import com.ejada.practice.daythree.enums.Error;

/**
 * Thrown when a provided name is blank or invalid.
 */
public class InvalidNameException extends IllegalArgumentException {
    /**
     * Creates a new exception using the shared name validation error.
     */
    public InvalidNameException() {
        super(Error.INVALID_NAME.getMessage());
    }
}
