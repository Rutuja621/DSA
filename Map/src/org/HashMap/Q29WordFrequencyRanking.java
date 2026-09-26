package org.HashMap;

import java.util.*;

public class Q29WordFrequencyRanking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter paragraph: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");


        HashMap<String, Integer> map =
                new HashMap<>();


        // Count frequency

        for (String word : words) {

            map.put(
                    word,
                    map.getOrDefault(word, 0) + 1
            );
        }


        // Convert entries into List

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(
                        map.entrySet()
                );


        // Sort by frequency descending

        list.sort(
                (e1, e2) ->
                        e2.getValue()
                                .compareTo(
                                        e1.getValue()
                                )
        );


        // Display

        for (Map.Entry<String, Integer> entry :
                list) {

            System.out.println(
                    entry.getKey()
                            + " = "
                            + entry.getValue()
            );
        }

        sc.close();
    }
}