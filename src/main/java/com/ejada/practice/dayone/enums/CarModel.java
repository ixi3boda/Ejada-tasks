package com.ejada.practice.dayone.enums;

/**
 * Represents supported car models used by the day one example.
 */
public enum CarModel {

    CIVIC("Civic"),
    ACCORD("Accord");

    private final String code;

    CarModel(String code) {
        this.code = code;
    }

    /**
     * Returns the model code associated with the enum constant.
     *
     * @return the model code
     */
    public String getCode() {
        return code;
    }

    /**
     * Finds a car model by its code.
     *
     * @param code the model code to look up
     * @return the matching car model, or null if no match is found
     */
    public static CarModel fromCode(String code) {
        for (CarModel model : values()) {
            if (model.code.equalsIgnoreCase(code)) {
                return model;
            }
        }
        return null;
    }
}