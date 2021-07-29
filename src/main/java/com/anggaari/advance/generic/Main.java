package com.anggaari.advance.generic;

import com.anggaari.advance.generic.models.Response;
import com.anggaari.advance.generic.models.errors.ServerError;
import com.anggaari.advance.generic.models.errors.ValidationError;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        Type integerType = new TypeToken<List<Integer>>() {}.getType();
        Type stringType = new TypeToken<List<String>>() {}.getType();

        String integerJson = gson.toJson(integerList, integerType);
        String stringJson = gson.toJson(stringList, stringType);

        System.out.println(integerJson);
        System.out.println(stringJson);

        // server error
        String serverErrorJson = "{'status': 'Internal Server Error', 'code': 500, 'errors': [{'type': 'IO Error', 'message': 'You do not have permission'}]}";
        Type serverErrorType = new TypeToken<Response<ServerError>>() {}.getType();
        Response<ServerError> serverErrorObj = gson.fromJson(serverErrorJson, serverErrorType);
        System.out.println(serverErrorObj.status);
        System.out.println(serverErrorObj.code);
        System.out.println(serverErrorObj.errors.get(0).type);
        System.out.println(serverErrorObj.errors.get(0).message);

        System.out.println("");

        // validation error
        String validationErrorJson = "{'status': 'Validation Error', 'code': 422, 'errors': [{'field': 'name', 'error': 'Name is required'}]}";
        Type validationErrorType = new TypeToken<Response<ValidationError>>() {}.getType();
        Response<ValidationError> validationErrorObj = gson.fromJson(validationErrorJson, validationErrorType);
        System.out.println(validationErrorObj.status);
        System.out.println(validationErrorObj.code);
        System.out.println(validationErrorObj.errors.get(0).field);
        System.out.println(validationErrorObj.errors.get(0).error);
    }
}
