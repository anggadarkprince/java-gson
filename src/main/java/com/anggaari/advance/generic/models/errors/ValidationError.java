package com.anggaari.advance.generic.models.errors;

public class ValidationError {
    public String field;
    public String error;

    public ValidationError(String field, String error) {
        this.field = field;
        this.error = error;
    }
}
