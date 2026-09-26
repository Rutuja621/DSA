package org.HashMap;

import java.util.*;

public class Q15DuplicateCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map =
                new HashMap<>();

        // Count characters

        for (char ch : str.toCharArray()) {

            if (map.containsKey(ch)) {

                map.put(
                        ch,
                        map.get(ch) + 1
                );

            } else {

                map.put(ch, 1);
            }
        }

        System.out.println("\nDuplicate Characters:");

        for (Map.Entry<Character, Integer> entry :
                map.entrySet()) {

            if (entry.getValue() > 1) {

                System.out.println(
                        entry.getKey()
                                + " = "
                                + entry.getValue()
                );
            }
        }

        sc.close();
    }
}