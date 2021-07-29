package com.anggaari.builder.lineant;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        // Gson (unlike the JsonReader) is already lenient by default
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setLenient();
        Gson gson = gsonBuilder.create();

        // If the violations go beyond of once of the list that not comply RFC4627 specification,
        // Gson will throw a MalformedJsonException
    }
}
