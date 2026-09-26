package org.HashMap;

import java.util.HashMap;
import java.util.Map;
/*
2.	Nested Map – Employee Department
Create a Map<String, Map<Integer, String>> where the outer key represents a department and the inner Map contains employee ID and employee name. Write a program to display all employees department-wise.
2.	Nested Map – Employee Department
Create a Map<String, Map<Integer, String>> where the outer key represents a department and the inner Map contains employee ID and employee name. Write a program to display all employees department-wise.

 */
public class EmployeeDetails {
    public static void main(String[] args) {
        Map<String,Map<Integer,String>> map=new HashMap<>();

        Map<Integer,String> emp1=new HashMap<>();
        emp1.put(1,"rt");

        Map<Integer,String> emp2=new HashMap<>();
        emp2.put(2,"rs");

        map.put("dev",emp1);
        map.put("gif",emp2);

        for (Map.Entry<String,Map<Integer,String>> entry:map.entrySet()){
            String dept=entry.getKey();

            Map<Integer,String> emp=entry.getValue();
            System.out.println(dept);

            for (Map.Entry<Integer,String> empD:emp.entrySet()){
                System.out.println(empD.getKey()+"-->"+empD.getValue());
            }
            System.out.println();
        }

    }
}
