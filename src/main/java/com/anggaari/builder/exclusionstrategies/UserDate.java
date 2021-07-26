package com.anggaari.builder.exclusionstrategies;

import java.util.Date;

public class UserDate {
    private String _name;
    private String email;
    private boolean isDeveloper;
    private int age;
    private Date registerDate = new Date();

    public UserDate(String _name, String email, int age, boolean isDeveloper) {
        this._name = _name;
        this.email = email;
        this.isDeveloper = isDeveloper;
        this.age = age;
        this.registerDate = registerDate;
    }
}
