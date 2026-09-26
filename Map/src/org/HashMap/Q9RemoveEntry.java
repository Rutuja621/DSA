package org.HashMap;

import java.util.*;

public class Q9RemoveEntry {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Laptop");
        map.put(102, "Mouse");
        map.put(103, "Keyboard");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID to remove: ");
        int id = sc.nextInt();

        map.remove(id);

        System.out.println("\nAfter Removing:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println(
                    entry.getKey() + " = " + entry.getValue()
            );
        }

        sc.close();
    }
}