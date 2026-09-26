package org.HashMap;

import java.util.*;

public class Q25CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {
                10, 20, 30, 40, 50
        };

        int[] arr2 = {
                30, 40, 50, 60, 70
        };


        HashMap<Integer, Boolean> map =
                new HashMap<>();


        // Store first array

        for (int num : arr1) {

            map.put(num, true);
        }


        System.out.println("Common Elements:");


        // Check second array

        for (int num : arr2) {

            if (map.containsKey(num)) {

                System.out.println(num);

                // Remove to avoid duplicate output
                map.remove(num);
            }
        }
    }
}