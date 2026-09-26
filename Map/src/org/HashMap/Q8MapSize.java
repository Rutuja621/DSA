package org.HashMap;

import java.util.*;

public class Q8MapSize {

    public static void main(String[] args) {

        HashMap<Integer, String> map =
                new HashMap<>();

        map.put(101, "Rahul");
        map.put(102, "Amit");
        map.put(103, "Priya");
        map.put(104, "Neha");

        System.out.println(
                "Total number of employees = "
                        + map.size()
        );
    }
}