/*
Q2. Write a function that accepts one integer and prints whether the number is Even or Odd.
Explanation
Use modulo operator %
If number % 2 == 0, print Even
Otherwise, print Odd
No return value used
Example
Input: 7        Output: Number is Odd*/

import java.util.*;
public class EvenOddNumFunc{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a integer number: ");
		int num=sc.nextInt();
	    getEvenodd(num);
		
		
	}
	
	public static void getEvenodd(int num){
		
		if(num%2==0){
			System.out.println("Even");
			
		}else{
			System.out.println("Odd");
			
		}
	
		
	}




}