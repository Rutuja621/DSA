package org.HashMap;

import java.util.*;

public class Q21SecondHighest {

    public static void main(String[] args) {

        HashMap<String, Integer> map =
                new HashMap<>();

        map.put("Rahul", 45000);
        map.put("Amit", 85000);
        map.put("Priya", 72000);
        map.put("Neha", 95000);


        String highestEmployee = null;
        String secondHighestEmployee = null;

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;


        for (Map.Entry<String, Integer> entry :
                map.entrySet()) {

            int salary = entry.getValue();


            if (salary > highest) {

                secondHighest = highest;
                secondHighestEmployee =
                        highestEmployee;

                highest = salary;
                highestEmployee =
                        entry.getKey();

            } else if (salary > secondHighest
                    && salary < highest) {

                secondHighest = salary;
                secondHighestEmployee =
                        entry.getKey();
            }
        }


        System.out.println(
                "Second Highest Employee = "
                        + secondHighestEmployee
        );

        System.out.println(
                "Salary = " + secondHighest
        );
    }
}