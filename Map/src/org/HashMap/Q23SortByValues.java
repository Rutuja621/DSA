package org.HashMap;

import java.util.*;

public class Q23SortByValues {

    public static void main(String[] args) {

        HashMap<String, Integer> map =
                new HashMap<>();

        map.put("Rahul", 75);
        map.put("Amit", 92);
        map.put("Priya", 85);
        map.put("Neha", 68);


        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(
                        map.entrySet()
                );


        list.sort(
                (e1, e2) ->
                        e2.getValue()
                                .compareTo(
                                        e1.getValue()
                                )
        );


        for (Map.Entry<String, Integer> entry :
                list) {

            System.out.println(
                    entry.getKey()
                            + " = "
                            + entry.getValue()
            );
        }
    }
}