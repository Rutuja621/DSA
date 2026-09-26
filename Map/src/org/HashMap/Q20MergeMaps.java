package org.HashMap;

import java.util.*;

public class Q20MergeMaps {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map1 =
                new HashMap<>();

        map1.put(101, 500);
        map1.put(102, 700);


        HashMap<Integer, Integer> map2 =
                new HashMap<>();

        map2.put(103, 900);
        map2.put(104, 1200);


        // Merge map2 into map1

        map1.putAll(map2);


        for (Map.Entry<Integer, Integer> entry :
                map1.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " = "
                            + entry.getValue()
            );
        }
    }
}