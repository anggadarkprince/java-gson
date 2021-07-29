package com.anggaari.builder.specialfloatdouble;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        UserFloat user = new UserFloat("Norman", Float.POSITIVE_INFINITY);

        String usersJson = gson.toJson(user); // will throw an exception
    }
}
