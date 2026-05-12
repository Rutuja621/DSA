/*
Q3. Write a function that accepts an integer N and prints numbers from 1 to N.
Explanation
Function receives value of N
Use a loop inside the function
Print numbers one by one
Example
Input: 5      — 1 2 3 4 5
*/

import java.util.*;
public class INTNNoPrintFunc{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a N number: ");
		int n=sc.nextInt();
		
		getNNumbers(n);
	}
	
	public static void getNNumbers(int n){
		int i=1;
		while(i<=n){
			System.out.println(i);
			i++;
		}
		
		
	}



}