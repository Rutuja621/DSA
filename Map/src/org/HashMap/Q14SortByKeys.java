package org.HashMap;

import java.util.*;

public class Q14SortByKeys {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap =
                new HashMap<>();

        hashMap.put("Rahul", 85);
        hashMap.put("Amit", 72);
        hashMap.put("Priya", 91);
        hashMap.put("Neha", 78);

        TreeMap<String, Integer> treeMap =
                new TreeMap<>(hashMap);

        System.out.println("Sorted Map:");

        for (Map.Entry<String, Integer> entry :
                treeMap.entrySet()) {

            System.out.println(
                    entry.getKey() + " = " + entry.getValue()
            );
        }
    }
}