package org.HashMap;

import java.util.*;

public class Q7CheckKey {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> map =
                new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("France", "Paris");

        System.out.print("Enter country: ");
        String country = sc.nextLine();

        if (map.containsKey(country)) {

            System.out.println(
                    country + " is present in the Map."
            );

        } else {

            System.out.println(
                    country + " is not present in the Map."
            );
        }

        sc.close();
    }
}