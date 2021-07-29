package com.anggaari.advance.circularreference;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Employee supervisor = new Employee("Alex", "alex@mail.com", 25, false, null, null);
        Employee subordinate = new Employee("Ica", "ica@mail.com", 25, true, null, null);
        Employee employeeObject = new Employee("Angga", "angga@mail.com", 25, true, supervisor, subordinate);

        System.out.println(gson.toJson(employeeObject));

        String employeeJson = "{" +
                "  'age': 26," +
                "  'subordinate': {" +
                "    'age': 26," +
                "    'email': 'angga@angga.com'," +
                "    'isDeveloper': true," +
                "    'name': 'Angga'" +
                "  }," +
                "  'email': 'norman@futurestud.io'," +
                "  'isDeveloper': true," +
                "  'name': 'Norman'" +
                "}";

        Employee employee = gson.fromJson(employeeJson, Employee.class);
        System.out.println(employee.name);
    }
}
