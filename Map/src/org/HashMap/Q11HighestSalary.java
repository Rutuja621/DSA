package org.HashMap;

import java.util.*;

public class Q11HighestSalary {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Rahul", 45000);
        map.put("Amit", 72000);
        map.put("Priya", 68000);
        map.put("Neha", 85000);

        String highestEmployee = null;
        int highestSalary = 0;

        for (Map.Entry<String, Integer> entry :
                map.entrySet()) {

            if (entry.getValue() > highestSalary) {

                highestSalary = entry.getValue();
                highestEmployee = entry.getKey();
            }
        }

        System.out.println(
                "Highest Salary Employee = "
                        + highestEmployee
        );

        System.out.println(
                "Salary = " + highestSalary
        );
    }
}