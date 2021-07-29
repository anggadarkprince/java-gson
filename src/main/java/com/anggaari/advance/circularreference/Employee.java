package com.anggaari.advance.circularreference;

public class Employee {
    public String name;
    public String email;
    public int age;
    public boolean isDeveloper;

    // references to child & parent node
    Employee subordinate;
    transient Employee supervisor;

    public Employee(String name, String email, int age, boolean isDeveloper, Employee subordinate, Employee supervisor) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
        this.subordinate = subordinate;
        this.supervisor = supervisor;
    }
}
