package com.anggaari.advance.customdeserialization;

import java.util.Date;

public class UserDate {
    public String name;
    public String email;
    public boolean isDeveloper;
    public int age;
    public Date registerDate;

    public UserDate(String name, String email, boolean isDeveloper, int age, Date registerDate) {
        this.name = name;
        this.email = email;
        this.isDeveloper = isDeveloper;
        this.age = age;
        this.registerDate = registerDate;
    }
}
