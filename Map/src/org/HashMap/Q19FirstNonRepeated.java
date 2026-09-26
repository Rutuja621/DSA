package org.HashMap;

import java.util.*;

public class Q19FirstNonRepeated {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map =
                new HashMap<>();

        // Step 1: Count frequency

        for (char ch : str.toCharArray()) {

            map.put(
                    ch,
                    map.getOrDefault(ch, 0) + 1
            );
        }

        // Step 2: Find first character
        // having frequency 1

        for (char ch : str.toCharArray()) {

            if (map.get(ch) == 1) {

                System.out.println(
                        "First Non-Repeated Character = "
                                + ch
                );

                break;
            }
        }

        sc.close();
    }
}