package com.ejada.practice.daythree.enums;

/**
 * Centralizes application error codes and messages.
 */
public enum Error {
    INVALID_AGE("E303001", "Age must be between 0 and 100."),
    INVALID_NAME("E303002", "Name cannot be blank.");

    private final String code;
    private final String message;

    Error(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
