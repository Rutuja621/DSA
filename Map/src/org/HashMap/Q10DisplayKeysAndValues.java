package org.HashMap;

import java.util.*;

public class Q10DisplayKeysAndValues {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Rahul");
        map.put(102, "Amit");
        map.put(103, "Priya");

        System.out.println("Keys:");

        for (Integer key : map.keySet()) {

            System.out.println(key);
        }

        System.out.println("\nValues:");

        for (String value : map.values()) {

            System.out.println(value);
        }
    }
}