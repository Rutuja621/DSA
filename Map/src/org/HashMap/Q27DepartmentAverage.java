package org.HashMap;

import java.util.*;

public class Q27DepartmentAverage {

    public static void main(String[] args) {

        HashMap<String, Map<String, Integer>> departmentMap =
                new HashMap<>();


        // IT

        HashMap<String, Integer> it =
                new HashMap<>();

        it.put("Rahul", 60000);
        it.put("Amit", 80000);
        it.put("Priya", 70000);


        // HR

        HashMap<String, Integer> hr =
                new HashMap<>();

        hr.put("Neha", 50000);
        hr.put("Raj", 70000);


        departmentMap.put("IT", it);
        departmentMap.put("HR", hr);


        // Process departments

        for (Map.Entry<String, Map<String, Integer>> deptEntry :
                departmentMap.entrySet()) {

            String department =
                    deptEntry.getKey();

            Map<String, Integer> employees =
                    deptEntry.getValue();


            int total = 0;


            for (int salary :
                    employees.values()) {

                total = total + salary;
            }


            double average =
                    (double) total / employees.size();


            System.out.println(
                    department
                            + " Average = "
                            + average
            );


            for (Map.Entry<String, Integer> employee :
                    employees.entrySet()) {

                if (employee.getValue() > average) {

                    System.out.println(
                            employee.getKey()
                                    + " = "
                                    + employee.getValue()
                    );
                }
            }

            System.out.println();
        }
    }
}