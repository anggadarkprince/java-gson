package com.anggaari.builder.formatdate;

import java.util.Date;

public class Employee {
    public int id;
    public String name;
    public Date hired;
    public Date quit;
    public double salary;

    public Employee(int id, String name, Date hired, double salary) {
        this.id = id;
        this.name = name;
        this.hired = hired;
        this.salary = salary;
        this.quit = null;
    }

    public Employee(int id, String name, Date hired, double salary, Date quit) {
        this.id = id;
        this.name = name;
        this.hired = hired;
        this.salary = salary;
        this.quit = quit;
    }
}
