/*
Q1.Write a function that accepts two integers and prints their sum.
Explanation
Function takes two numbers as parameters
Calculates sum inside the function
Prints the result using System.out.println()
Example
Input: 10, 20              Output: Sum = 30
*/
import java.util.Scanner;
public class TwoIntSumFunc{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		getSum(num1,num2);
	}
	
	public static int getSum(int num1,int num2){
		return num1+num2;
		
		
	}





}