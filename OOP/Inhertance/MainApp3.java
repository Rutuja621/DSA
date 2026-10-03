/*
Question 3: Create a base class Student with attributes name and rollNo.
Create a child class Result that includes marks of 3 subjects.
Calculate total and percentage.
Asked In Practice Assignment
Description
This assignment demonstrates inheritance with calculation logic.
The child class uses parent data and extends it to compute academic results.

Input
Enter Name: Amit
Enter Roll No: 101
Enter Marks1: 80
Enter Marks2: 70
Enter Marks3: 90

Output
Name: Amit
Roll No: 101
Total Marks: 240
Percentage: 80.0% */

import java.util.Scanner;
class Student{
	String name;
	int rollNo;
	
	public Student(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
				
	}





}

class Result extends Student{
	int s1,s2,s3;
	int marks;
	double total;
	
	
	public Result(String name,int rollNo,int s1,int s2,int s3){
		
		super(name,rollNo);
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		
		
		
	}
	
	public void calculate(){
		marks=s1+s2+s3;
		total=marks/3;
	}
	
	public void display(){
		System.out.println("name: "+name);
		System.out.println("rollNo: "+rollNo);
		System.out.println("marks: "+marks);
		System.out.println("total: "+total);
		
		
		
	}



}

public class MainApp3{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name=sc.next();
		
		System.out.println("Enter rollNo: ");
		int rollNo=sc.nextInt();
		
		System.out.println("Enter subject1 marks: ");
		int s1=sc.nextInt();
		
		System.out.println("Enter subject2 marks: ");
		int s2=sc.nextInt();
		
		System.out.println("Enter subject3 marks: ");
		int s3=sc.nextInt();
		
		Result rs=new Result(name,rollNo,s1,s2,s3);
		rs.calculate();
		rs.display();
		
	}




}



