package org.List.com.ArrayList;

import java.util.ArrayList;

public class StringLengthCount {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Store strings
        list.add("Apple");
        list.add("Banana");
        list.add("Kiwi");
        list.add("Orange");
        list.add("Mango");

        int count = 0;

        // Check string length
        for (String str : list) {
            if (str.length() > 5) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}