package org.HashMap;

import java.util.*;

public class Q5EmployeeSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> map =
                new HashMap<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            map.put(name, salary);
        }

        System.out.println(
                "\nEmployees with salary greater than 50000:"
        );

        for (Map.Entry<String, Double> entry :
                map.entrySet()) {

            if (entry.getValue() > 50000) {

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