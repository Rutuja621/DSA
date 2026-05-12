/*
Q6.Write a Java program that uses a void function to check whether a given two-digit number is a special number.
A number is special if: (sum of digits + product of digits) = original number
Explanation
Pass the number to a function
Extract digits using % and /
Calculate sum and product
Print result inside the function
*/

import java.util.*;
public class SpecialNumFunc{
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		getSpecialNum(num);
	}
	
	public static void getSpecialNum(int num){
		
		int temp=num;
		int sum=0;
		int product=1;
		while(temp>0){
			int digit=temp%10;
			sum+=digit;
			product*=digit;
			temp/=10;
		}
		System.out.println(sum);
		System.out.println(product);
		
		if(sum+product==num){
			System.out.println(num+" is a special number.");
			
		}else{
			System.out.println(num+" is not a special number.");
			
		}
		
		
	}



}