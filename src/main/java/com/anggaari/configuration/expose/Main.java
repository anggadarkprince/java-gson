package com.anggaari.configuration.expose;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        GsonBuilder builder = new GsonBuilder();
        builder.excludeFieldsWithoutExposeAnnotation();
        Gson gson = builder.create();

        // deserialization
        String userJson = "{ 'name':'Angga Ari Wijaya', 'email_address': 'angga@mail.com', 'age': 25, 'is_developer': true }";
        User userObject = gson.fromJson(userJson, User.class);
        System.out.println(userObject.name);
        System.out.println(userObject.email); // null because prevent to deserialization


    }
}
