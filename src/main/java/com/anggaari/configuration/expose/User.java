package com.anggaari.configuration.expose;

import com.google.gson.annotations.Expose;

public class User {
    @Expose() // equal as if not set
    public String name; // equals serialize & deserialize

    @Expose(serialize = false, deserialize = false)
    public String email; // equals neither serialize nor deserialize

    @Expose(serialize = false)
    public int age; // equals only deserialize

    @Expose(deserialize = false)
    public boolean isDeveloper; // equals only serialize

    //boolean transient isDeveloper; // will not be serialized or deserialized

    public User(String name, String email, int age, boolean isDeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }
}
