package org.HashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
1.	Nested Map – Student Marks
Create a Map<String, Map<String, Integer>> where the outer key is the student name and the inner Map contains subject names and marks. Write a program to:
o	Add 3 students.
o	Add marks for 3 subjects.
o	Display each student's marks.





 */
public class NestedMapStudDetails {
    public static void main(String[] args) {
        //nested map
        //outer map         //inner map
        HashMap<String, Map<String,Integer>> map=new HashMap<>();

        //inner map info
        Map<String,Integer> stud1=new HashMap<>();
        stud1.put("math",84);
        stud1.put("english",78);
        stud1.put("science",89);

        Map<String,Integer> stud2=new HashMap<>();
        stud2.put("math",84);
        stud2.put("english",78);
        stud2.put("science",89);

        Map<String,Integer> stud3=new HashMap<>();
        stud3.put("math",84);
        stud3.put("english",78);
        stud3.put("science",89);


        //add students to outer map
        map.put("Rutuja",stud1);
        map.put("Sa",stud2);
        map.put("rohit",stud3);



        //diplay each student marks

        //for outer map
        int highes=0;
        for (Map.Entry<String,Map<String,Integer>> entry: map.entrySet()){
            String studName=entry.getKey();

            Map<String,Integer> val=entry.getValue();
            System.out.println(studName);

            //get values form inner map
            for (Map.Entry<String,Integer> subject:val.entrySet()){
                System.out.println(subject.getKey()+"-->"+subject.getValue());
                int mark=subject.getValue();
                 if(mark>highes){
                     highes=mark;

                 }
            }


            System.out.println();

        }
        System.out.println("Highest Marks is: "+highes);




    }
}
