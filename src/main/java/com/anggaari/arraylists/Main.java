package com.anggaari.arraylists;

import com.anggaari.arraylists.restaurant.Founder;
import com.anggaari.arraylists.restaurant.GeneralInfo;
import com.anggaari.arraylists.restaurant.RestaurantMenuItem;
import com.anggaari.arraylists.restaurant.RestaurantWithMenu;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RestaurantMenuItem> menu = new ArrayList<>();
        menu.add(new RestaurantMenuItem("Spaghetti", 7.99f));
        menu.add(new RestaurantMenuItem("Steak", 12.99f));
        menu.add(new RestaurantMenuItem("Salad", 5.99f));

        RestaurantWithMenu restaurant = new RestaurantWithMenu("Future Studio Steak House", menu);

        Gson gson = new Gson();

        // serialization
        String restaurantJson = gson.toJson(restaurant);
        System.out.println(restaurantJson);

        String restaurantMenuJson = gson.toJson(menu);
        System.out.println(restaurantMenuJson);

        // deserialization
        // ARRAY
        String founderJson = "[{'name': 'Christian','flowerCount': 1}, {'name': 'Marcus', 'flowerCount': 3}, {'name': 'Norman', 'flowerCount': 2}]";
        Founder[] founderArray = gson.fromJson(founderJson, Founder[].class);
        System.out.println(founderArray[0].name);

        // LIST
        Type founderListType = new TypeToken<ArrayList<Founder>>(){}.getType();
        List<Founder> founderList = gson.fromJson(founderJson, founderListType);
        System.out.println(founderList.get(0).name);

        // LIST AS PART OF OBJECT
        // The advantage of the list nested in an object is the simple Gson call without any TypeToken handling.
        // We can directly pass the class:
        String generalInfoJson = "{'name': 'Future Studio Dev Team', 'website': 'https://futurestud.io', 'founders': [{'name': 'Christian', 'flowerCount': 1 }, {'name': 'Marcus','flowerCount': 3 }, {'name': 'Norman','flowerCount': 2 }]}";
        GeneralInfo generalInfoObject = gson.fromJson(generalInfoJson, GeneralInfo.class);
        System.out.println(generalInfoObject.name);
        System.out.println(generalInfoObject.founders.toString());
    }
}
