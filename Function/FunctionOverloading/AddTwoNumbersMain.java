/*
1. Add Numbers Using Method Overloading

Write a Java program to overload a method add() to:

Add two integers.
Add three integers.
Add two double values.*/

import java.util.Scanner;
class AddTwoNumbers{
	public void addNum(int a,int b){
		System.out.println("Integer addition: "+(a+b));
		
		
	}
	
	public void addNum(int a,int b,int c){
		System.out.println("Integer addition three numbers: "+(a+b+c));
		
		
	}
	
	public void addNum(double a,double b){
		
		System.out.println("Double addition: "+(a+b));
		
	}
}

public class AddTwoNumbersMain{
	public static void main(String [] arg){
	
		AddTwoNumbers add=new AddTwoNumbers();
		add.addNum(10,20);
		add.addNum(10,20,30);
		add.addNum(10.43,20.42);
		
		
	}

}