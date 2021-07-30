package com.anggaari.advance.custominstancecreator;

public class UserContext {
    public String name;
    public String email;
    public boolean isDeveloper;
    public int age;

    // additional attribute, which is not part of the data model
    public String context;

    public UserContext(String context) {
        this.context = context;
    }
}
