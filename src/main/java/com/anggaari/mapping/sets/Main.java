package com.anggaari.mapping.sets;

import com.anggaari.mapping.arraylists.restaurant.Founder;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> users = new HashSet<>();
        users.add("Christian");
        users.add("Marcus");
        users.add("Norman");
        users.add("Marcus"); // would not be added again

        Gson gson = new Gson();

        // serialization
        String usersJson = gson.toJson(users);
        System.out.println(usersJson);

        // deserialization
        Type userSetType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> users2 = gson.fromJson(usersJson, userSetType);
        System.out.println(users2.contains("Norman"));

        // deserialize set of objects
        String founderJson = "[{'name': 'Christian','flowerCount': 1}, {'name': 'Marcus', 'flowerCount': 3}, {'name': 'Norman', 'flowerCount': 2}]";
        Type founderSetType = new TypeToken<HashSet<Founder>>(){}.getType();
        HashSet<Founder> founderSet = gson.fromJson(founderJson, founderSetType);
        System.out.println(founderSet.iterator().next().name);
    }
}
