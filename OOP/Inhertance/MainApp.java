/*
Question 1: Create a base class Employee with attributes name and salary.
Create a child class Manager that adds bonus.
Calculate total salary using inheritance.
Asked In Practice Assignment
Description
This program demonstrates single inheritance where Manager inherits from Employee.
The child class extends functionality by adding a bonus and calculating total salary.

Input
Enter Name: Rahul
Enter Salary: 50000
Enter Bonus: 10000

Output
Employee Name: Rahul
Base Salary: 50000
Bonus: 10000
Total Salary: 60000 */

import java.util.Scanner;
class Employee{
	String name;
	double salary;
	
	public Employee(String name,double salary){
		this.name=name;
		this.salary=salary;			
	}
}

class Manager extends Employee{
	double bonus;
	
	public Manager(String name,double salary,double bonus){
		super(name,salary);
		this.bonus=bonus;		
	}
	
	public void DisplayDetails(){
		double totalSalary=salary + bonus;
		System.out.println("Name: "+name);
		System.out.println("salary: "+salary);
		System.out.println("bonus: "+bonus);
		System.out.println("Total Salary: "+totalSalary);
		
	}

}

public class MainApp{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Emp name: ");
		String name=sc.next();
		
		System.out.println("Enter Emp Salary: ");
		double salary=sc.nextInt();
		
		
		System.out.println("Enter bonus: ");
		double bonus=sc.nextDouble();
		
		
		Manager mg=new Manager(name,salary,bonus);
		mg.DisplayDetails();
		
	
	
	
	
	}
	
}