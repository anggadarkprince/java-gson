package com.anggaari.serializedname;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // deserialization
        String userJson = "{ 'full_name':'Angga Ari Wijaya', 'email_address': 'angga@mail.com', 'age': 25, 'is_developer': true }";
        User userObject = gson.fromJson(userJson, User.class);
        System.out.println(userObject.name);
        System.out.println(userObject.email);
        System.out.println(userObject.age);
        System.out.println(userObject.isDeveloper);

        // no full_name available, fallback to username field
        String userJson2 = "{ 'username':'Angga Ari Wijaya', 'email_address': 'angga@mail.com', 'age': 25, 'is_developer': true }";
        User userObject2 = gson.fromJson(userJson2, User.class);
        System.out.println(userObject2.name);

        // will using username field, since that value comes later
        String userJson3 = "{ 'full_name':'Angga Ari Wijaya', 'username':'anggadarkprince', 'email_address': 'angga@mail.com', 'age': 25, 'is_developer': true }";
        User userObject3 = gson.fromJson(userJson3, User.class);
        System.out.println(userObject3.name);
    }
}
