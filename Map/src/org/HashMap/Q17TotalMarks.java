package org.HashMap;

import java.util.*;

public class Q17TotalMarks {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Java", 85);
        map.put("SQL", 78);
        map.put("Python", 92);
        map.put("PowerBI", 80);

        int total = 0;

        for (Integer marks : map.values()) {

            total = total + marks;
        }

        double average =
                (double) total / map.size();

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}