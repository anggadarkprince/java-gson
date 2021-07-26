package com.anggaari.simple.user;

public class UserSimple {
    public String name;
    public String email;
    public int age;
    public boolean isDeveloper;
    public UserAddress userAddress;

    public UserSimple(String name, String email, int age, boolean isDeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }

    public UserSimple(String name, String email, int age, boolean isDeveloper, UserAddress userAddress) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
        this.userAddress = userAddress;
    }
}
