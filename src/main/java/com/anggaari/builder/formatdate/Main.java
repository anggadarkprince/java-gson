package com.anggaari.builder.formatdate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GsonBuilder builder = new GsonBuilder();
        builder.setDateFormat("yyyy-MM-dd HH:mm:ss");
        Gson gson = builder.create();

        Employee emp = new Employee(115, "Surya", new Date(), 25000.00);
        String result = gson.toJson(emp);
        System.out.println(result);
        
        String employeeJson = "{'id':115,'name':'Surya','hired':'2021-07-29 14:05:07','salary':25000.0}";
        Employee employee = gson.fromJson(employeeJson, Employee.class);
        System.out.println(employee.hired);

        String employeeQuitJson = "{'id':115,'name':'Surya','hired':'2021-07-29 14:05:07','salary':25000.0,'quit':'2021-08-10'}";
        Employee employeeQuit = gson.fromJson(employeeQuitJson, Employee.class);
        System.out.println(employeeQuit.hired + " then quit at " + employeeQuit.quit);
    }
}
