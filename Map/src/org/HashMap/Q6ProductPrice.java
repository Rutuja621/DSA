package org.HashMap;

import java.util.*;

public class Q6ProductPrice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map =
                new HashMap<>();

        map.put("Laptop", 55000);
        map.put("Mobile", 25000);
        map.put("Tablet", 18000);

        System.out.print("Enter product name: ");
        String product = sc.nextLine();

        if (map.containsKey(product)) {

            System.out.println(
                    product
                            + " Price = "
                            + map.get(product)
            );

        } else {

            System.out.println("Product not found.");
        }

        sc.close();
    }
}