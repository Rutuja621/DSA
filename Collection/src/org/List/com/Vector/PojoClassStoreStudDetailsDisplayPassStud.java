package org.List.com.Vector;

import java.util.Scanner;
import java.util.Vector;

public class PojoClassStoreStudDetailsDisplayPassStud {
    private int id;
    private String name;
    private int marks;

    PojoClassStoreStudDetailsDisplayPassStud(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int id;
        String name;
        int marks;
        Vector<PojoClassStoreStudDetailsDisplayPassStud> vc=new Vector<>();
        //anonyms object created
        vc.add(new PojoClassStoreStudDetailsDisplayPassStud(101,"rutuja",67));
        vc.add(new PojoClassStoreStudDetailsDisplayPassStud(102,"sakshi",62));
        vc.add(new PojoClassStoreStudDetailsDisplayPassStud(103,"rohit",50));
        vc.add(new PojoClassStoreStudDetailsDisplayPassStud(104,"aditi",45));

        System.out.println("Student who scoring above 60%");
        for(PojoClassStoreStudDetailsDisplayPassStud mark:vc){
            if(mark.getMarks()>60){
                System.out.println(mark);

            }

        }

    }
}
