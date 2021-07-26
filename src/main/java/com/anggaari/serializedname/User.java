package com.anggaari.serializedname;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName(value = "full_name", alternate = "username")
    public String name;
    @SerializedName("email_address")
    public String email;
    public int age;
    @SerializedName("is_developer")
    public boolean isDeveloper;

    public User(String name, String email, int age, boolean isDeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }
}
