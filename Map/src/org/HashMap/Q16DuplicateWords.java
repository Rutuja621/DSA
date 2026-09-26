package org.HashMap;

import java.util.*;

public class Q16DuplicateWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            map.put(
                    word,
                    map.getOrDefault(word, 0) + 1
            );
        }

        System.out.println("Duplicate Words:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {

                System.out.println(
                        entry.getKey() + " = " + entry.getValue()
                );
            }
        }

        sc.close();
    }
}