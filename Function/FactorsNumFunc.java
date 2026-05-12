/*
Q7. Write a Java program using a void function to print all factors of a given number.
Explanation
Function accepts one integer parameter
Use a loop from 1 to the number
If number is divisible, print the factor
No return value
*/

import java.util.*;
public class FactorsNumFunc{
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		getFactors(num);
	}
	
	public static void getFactors(int num){
	    int i=1;
		System.out.println("All factors of "+num+" are: ");
		while(i<=num){
			if(num%i==0){
			System.out.println(i);
			
			}i++;
		}
		
	}



}