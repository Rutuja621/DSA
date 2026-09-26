package org.HashMap;

import java.util.*;

public class Q22MaximumFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map =
                new HashMap<>();


        // Count frequency

        for (char ch : str.toCharArray()) {

            map.put(
                    ch,
                    map.getOrDefault(ch, 0) + 1
            );
        }


        char maxCharacter = '\0';
        int maxFrequency = 0;


        // Find maximum

        for (Map.Entry<Character, Integer> entry :
                map.entrySet()) {

            if (entry.getValue() > maxFrequency) {

                maxFrequency =
                        entry.getValue();

                maxCharacter =
                        entry.getKey();
            }
        }


        System.out.println(
                "Maximum Frequency Character = "
                        + maxCharacter
        );

        System.out.println(
                "Frequency = " + maxFrequency
        );

        sc.close();
    }
}