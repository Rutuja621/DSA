package org.HashMap;

import java.util.*;

public class Q4WordFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        HashMap<String, Integer> map =
                new HashMap<>();

        for (String word : words) {

            if (map.containsKey(word)) {

                map.put(word, map.get(word) + 1);

            } else {

                map.put(word, 1);
            }
        }

        System.out.println("\nWord Frequency:");

        for (Map.Entry<String, Integer> entry :
                map.entrySet()) {
            
            System.out.println(
                    entry.getKey() + " = " + entry.getValue()
            );
			
			}
        }

        sc.close();
    }
}