package com.anggaari.advance.generic.models;

import java.util.List;

public class Response<T> {
    public String status;
    public int code;
    public List<T> errors;

    public Response(String status, int code, List<T> errors) {
        this.status = status;
        this.code = code;
        this.errors = errors;
    }
}
