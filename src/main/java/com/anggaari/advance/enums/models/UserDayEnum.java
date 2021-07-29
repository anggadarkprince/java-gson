package com.anggaari.advance.enums.models;

public class UserDayEnum {
    public String name;
    public String email;
    public boolean isDeveloper;
    public int age;
    public Day day = Day.FRIDAY;

    public UserDayEnum(String name, String email, boolean isDeveloper, int age, Day day) {
        this.name = name;
        this.email = email;
        this.isDeveloper = isDeveloper;
        this.age = age;
        this.day = day;
    }
}
