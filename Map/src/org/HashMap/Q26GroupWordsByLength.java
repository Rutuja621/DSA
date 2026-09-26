package org.HashMap;

import java.util.*;

public class Q26GroupWordsByLength {

    public static void main(String[] args) {

        String[] words = {
                "Java",
                "SQL",
                "Python",
                "Spring",
                "C++",
                "HTML"
        };


        HashMap<Integer, List<String>> map =
                new HashMap<>();


        for (String word : words) {

            int length = word.length();


            if (!map.containsKey(length)) {

                map.put(
                        length,
                        new ArrayList<>()
                );
            }


            map.get(length).add(word);
        }


        for (Map.Entry<Integer, List<String>> entry :
                map.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " = "
                            + entry.getValue()
            );
        }
    }
}