package org.HashMap;

import java.util.*;

public class Q12LowestSalary {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Rahul", 45000);
        map.put("Amit", 72000);
        map.put("Priya", 38000);
        map.put("Neha", 85000);

        String lowestEmployee = null;

        int lowestSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry :
                map.entrySet()) {

            if (entry.getValue() < lowestSalary) {

                lowestSalary = entry.getValue();
                lowestEmployee = entry.getKey();
            }
        }

        System.out.println(
                "Lowest Salary Employee = "
                        + lowestEmployee
        );

        System.out.println(
                "Salary = " + lowestSalary
        );
    }
}