package org.List.com.Vector;

import java.util.Vector;

class Salary{
    private int id;
    private  String name;
    private double salary;
    Salary(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
        Vector<Salary> vc=new Vector<>();
        vc.add(new Salary(1,"abc",25500.00));
        vc.add(new Salary(1,"def",10000.00));
        vc.add(new Salary(1,"jkl",25000.00));

        for (Salary s:vc){
            if(s.getSalary()>25000){
                System.out.println("\nid: "+s.getId()+"\nname: "+s.getName()+"\nsalary: "+s.getSalary());

            }

        }


    }
}
