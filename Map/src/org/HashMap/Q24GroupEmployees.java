package org.HashMap;

import java.util.*;

public class Q24GroupEmployees {

    public static void main(String[] args) {

        HashMap<String, String> employees =
                new HashMap<>();

        employees.put("Rahul", "IT");
        employees.put("Amit", "HR");
        employees.put("Priya", "IT");
        employees.put("Neha", "Finance");
        employees.put("Raj", "HR");


        HashMap<String, List<String>> departmentMap =
                new HashMap<>();


        for (Map.Entry<String, String> entry :
                employees.entrySet()) {

            String employee =
                    entry.getKey();

            String department =
                    entry.getValue();


            if (!departmentMap.containsKey(department)) {

                departmentMap.put(
                        department,
                        new ArrayList<>()
                );
            }


            departmentMap
                    .get(department)
                    .add(employee);
        }


        for (Map.Entry<String, List<String>> entry :
                departmentMap.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " = "
                            + entry.getValue()
            );
        }
    }
}