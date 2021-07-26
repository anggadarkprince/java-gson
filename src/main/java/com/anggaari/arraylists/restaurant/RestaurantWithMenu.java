package com.anggaari.arraylists.restaurant;

import java.util.List;

public class RestaurantWithMenu {
    String name;
    public List<RestaurantMenuItem> menu;
    //public RestaurantMenuItem[] menu; // alternative, either one is fine

    public RestaurantWithMenu(String name, List<RestaurantMenuItem> menu) {
        this.name = name;
        this.menu = menu;
    }
}
