package org.HashMap;

import java.util.*;

public class Q2SearchStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Rahul", 85);
        map.put("Amit", 72);
        map.put("Priya", 91);

        System.out.print("Enter student name to search: ");
        String name = sc.nextLine();

        if (map.containsKey(name)) {

            System.out.println(
                    name + "'s Marks = " + map.get(name)
            );

        } else {

            System.out.println("Student not found.");
        }

        sc.close();
    }
}