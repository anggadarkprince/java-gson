package com.anggaari.advance.polymorphicobjects;

import com.anggaari.advance.polymorphicobjects.models.Animal;
import com.anggaari.advance.polymorphicobjects.models.Cat;
import com.anggaari.advance.polymorphicobjects.models.Dog;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Main {
    public static class ServiceResponse {
        Animal animal;
    }

    public static void main(String[] args) {
        String responseJson = "{'name': 'Aika', 'type': 'cat', 'chasesRedLaserDot': true}"; // from the service endpoint

        // which format has the response of the server
        final TypeToken<ServiceResponse> requestListTypeToken = new TypeToken<>() {};

        // adding all different container classes with their flag
        final RuntimeTypeAdapterFactory<Animal> typeFactory = RuntimeTypeAdapterFactory
                .of(Animal.class, "type") // Here you specify which is the parent class and what field particularizes the child class.
                .registerSubtype(Dog.class, "dog") // if the flag equals the class name, you can skip the second parameter. This is only necessary, when the "type" field does not equal the class name.
                .registerSubtype(Cat.class, "cat");

        // add the polymorphic specialization
        final Gson gson = new GsonBuilder().registerTypeAdapterFactory(typeFactory).create();

        // do the mapping
        final Cat deserializedRequestList = gson.fromJson(responseJson, Cat.class);
        System.out.println(deserializedRequestList.name);
        System.out.println(deserializedRequestList.chasesRedLaserDot);
    }
}
