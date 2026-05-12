/*
Q1. Write a java program to check number is neon number or not. 
Example : A neon number is a number where the sum of digits of the square of the number is 
equal to the number.*/

import java.util.*;
public class NeonNum{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		//take the square of a num
		int square=num*num;
		
		int temp=square;//to store square for the further opration
		int sum=0;//to store the sum of digits
		while(temp!=0){//execute loop till it remains zero
			int digit=temp%10;//to extract digit 
			sum+=digit;//to store the extracted digit in sum
			temp/=10;//to remove the stored number
			
		}
		if(sum==num){//check if sum of digits is equal to num
			System.out.println("It is an neon number");//print neon number
	  }else{
		 System.out.println("Not an neon number"); //if condition fails print not a neon num
	  }




	}


}