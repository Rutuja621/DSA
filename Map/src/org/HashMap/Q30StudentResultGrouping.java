package org.HashMap;

import java.util.*;

public class Q30StudentResultGrouping {

    public static void main(String[] args) {

        HashMap<String, Integer> students =
                new HashMap<>();

        students.put("Rahul", 92);
        students.put("Amit", 78);
        students.put("Priya", 65);
        students.put("Neha", 35);
        students.put("Raj", 88);


        HashMap<String, List<String>> resultMap =
                new LinkedHashMap<>();


        resultMap.put(
                "Excellent",
                new ArrayList<>()
        );

        resultMap.put(
                "Good",
                new ArrayList<>()
        );

        resultMap.put(
                "Average",
                new ArrayList<>()
        );

        resultMap.put(
                "Fail",
                new ArrayList<>()
        );


        // Categorize students

        for (Map.Entry<String, Integer> entry :
                students.entrySet()) {

            String name =
                    entry.getKey();

            int marks =
                    entry.getValue();


            if (marks >= 90) {

                resultMap
                        .get("Excellent")
                        .add(name);

            } else if (marks >= 70) {

                resultMap
                        .get("Good")
                        .add(name);

            } else if (marks >= 50) {

                resultMap
                        .get("Average")
                        .add(name);

            } else {

                resultMap
                        .get("Fail")
                        .add(name);
            }
        }


        // Display

        for (Map.Entry<String, List<String>> entry :
                resultMap.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " = "
                            + entry.getValue()
            );
        }
    }
}