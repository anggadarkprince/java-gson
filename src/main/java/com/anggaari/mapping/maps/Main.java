package com.anggaari.mapping.maps;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, List<String>> employees = new HashMap<>();
        employees.put("A", Arrays.asList("Andreas", "Arnold", "Aden"));
        employees.put("C", Arrays.asList("Christian", "Carter"));
        employees.put("M", Arrays.asList("Marcus", "Mary"));

        Gson gson = new Gson();

        // serialization
        String employeeJson = gson.toJson(employees);
        System.out.println(employeeJson);

        // deserialization
        // how can you spot the difference between a "set" and "multiple objects"? The simple answer is: you can't.
        // This is one of the few instances where the JSON data representation is ambiguous.
        // we'll assume the JSON is a map of data
        String dollarJson = "{ '1$': { 'amount': 1, 'currency': 'Dollar'}, '2$': { 'amount': 2, 'currency': 'Dollar'}, '3€': { 'amount': 3, 'currency': 'Euro'} }";
        Type amountCurrencyType = new TypeToken<HashMap<String, AmountWithCurrency>>(){}.getType();

        HashMap<String, AmountWithCurrency> amountCurrency = gson.fromJson(dollarJson, amountCurrencyType);
        System.out.println(amountCurrency.get("2$").amount);
        System.out.println(amountCurrency.get("2$").currency);
    }
}
