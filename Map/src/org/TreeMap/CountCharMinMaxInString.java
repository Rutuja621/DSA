package org.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class CountCharMinMaxInString {

    public static void main(String[] args) {

        String str = "I love java programming";

        Map<Character, Integer> map = new TreeMap<>();

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println("Character Frequency:");

        for (char ch : map.keySet()) {
            System.out.println(ch + " = " + map.get(ch));
        }

        int max = 0;
        int min = Integer.MAX_VALUE;

        // Find max and min frequency
        for (char ch : map.keySet()) {

            int count = map.get(ch);

            if (count > max) {
                max = count;
            }

            if (count < min) {
                min = count;
            }
        }

        // Print ALL maximum characters
        System.out.println("\nHighest Frequency:");

        for (char ch : map.keySet()) {
            if (map.get(ch) == max) {
                System.out.println(ch + " = " + max);
            }
        }

        // Print ALL minimum characters
        System.out.println("\nLowest Frequency:");

        for (char ch : map.keySet()) {
            if (map.get(ch) == min) {
                System.out.println(ch + " = " + min);
            }
        }
    }
}