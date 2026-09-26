package org.HashMap;

import java.util.*;

public class Q1StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            map.put(name, marks);
        }

        System.out.println("\nStudent Marks:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println(
                    entry.getKey() + " = " + entry.getValue()
            );
        }

        sc.close();
    }
}