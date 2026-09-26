package org.HashMap;

import java.util.*;

public class Q13CountValEvenOdd {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 25);
        map.put(2, 18);
        map.put(3, 41);
        map.put(4, 60);
        map.put(5, 72);

        int evenCount = 0;
        int oddCount = 0;

        for (Integer value : map.values()) {

            if (value % 2 == 0) {

                evenCount++;

            } else {

                oddCount++;
            }
        }

        System.out.println(
                "Even Values = " + evenCount
        );

        System.out.println(
                "Odd Values = " + oddCount
        );
    }
}