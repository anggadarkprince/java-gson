package com.anggaari.nestedobjects.restaurant;

public class Restaurant {
    public String name;
    public Owner owner;
    public Cook cook;
    public Waiter waiter;

    public Restaurant(String name, Owner owner, Cook cook, Waiter waiter) {
        this.name = name;
        this.owner = owner;
        this.cook = cook;
        this.waiter = waiter;
    }
}