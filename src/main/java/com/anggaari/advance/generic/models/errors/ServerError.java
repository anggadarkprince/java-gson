package com.anggaari.advance.generic.models.errors;

public class ServerError {
    public String type;
    public String message;

    public ServerError(String type, String message) {
        this.type = type;
        this.message = message;
    }
}
