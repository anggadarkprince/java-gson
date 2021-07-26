package com.anggaari.mapping.nestedobjects;

import com.anggaari.mapping.nestedobjects.restaurant.Restaurant;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String restaurantJson = "{ 'name':'Future Studio Steak House', 'owner':{ 'name':'Christian', 'address':{ 'city':'Magdeburg', 'country':'Germany', 'houseNumber':'42', 'street':'Main Street'}},'cook':{ 'age':18, 'name': 'Marcus', 'salary': 1500 }, 'waiter':{ 'age':18, 'name': 'Norman', 'salary': 1000}}";
        Gson gson = new Gson();
        Restaurant restaurantObject = gson.fromJson(restaurantJson, Restaurant.class);
        System.out.println(restaurantObject.name);
        System.out.println(restaurantObject.owner.name);
        System.out.println(restaurantObject.owner.address.street);
        System.out.println(restaurantObject.cook.name);
    }
}
