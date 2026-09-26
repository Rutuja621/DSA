package org.HashMap;

import java.util.*;

public class Q28TopThreeSalary {

    public static void main(String[] args) {

        HashMap<String, Integer> map =
                new HashMap<>();

        map.put("Rahul", 55000);
        map.put("Amit", 90000);
        map.put("Priya", 75000);
        map.put("Neha", 95000);
        map.put("Raj", 82000);


        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(
                        map.entrySet()
                );


        // Sort descending

        list.sort(
                (e1, e2) ->
                        e2.getValue()
                                .compareTo(
                                        e1.getValue()
                                )
        );


        // Display top 3

        for (int i = 0; i < 3 && i < list.size(); i++) {

            Map.Entry<String, Integer> entry =
                    list.get(i);

            System.out.println(
                    entry.getKey()
                            + " = "
                            + entry.getValue()
            );
        }
    }
}