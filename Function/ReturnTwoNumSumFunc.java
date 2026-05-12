/*
Q1. Write a Java method that takes two integers as input and returns their sum.
Explanation
The method receives two numbers
It adds them
Returns the result to the main method
Method Signature - static int getSum(int a, int b)
Input - a = 10, b = 20
Output - Sum = 30
*/

import java.util.*;
public class ReturnTwoNumSumFunc{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("a= ");
		int num1=sc.nextInt();
		System.out.print("b= ");
		int num2=sc.nextInt();
		
		int result=getSum(num1,num2);
		System.out.println("sum= "+result);
		
		
	}
	
	public static int getSum(int num1,int num2){
		
		int sum=0;
		sum=num1+num2;
		return sum;
		
		
		
	}






}