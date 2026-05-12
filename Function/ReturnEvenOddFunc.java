/*
Q2. Write a method that takes an integer and returns 1 if the number is even, otherwise returns 0.
Explanation
If number is divisible by 2 → Even
Else → Odd
Method returns an integer value
Method Signature - static int isEven(int num)
Input - num = 7 
Output - Odd
*/

import java.util.Scanner;
public class ReturnEvenOddFunc{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
       //int result= ;
	   
	   if(isEven(num))
	   {
		     System.out.println("Even");
	   }else{
		   System.out.println("odd");
	   }
	 


	}
	
	public static boolean isEven(int num){
		if(num%2==0){
			return true;
			
		}else{
			
			return false;
		}
		
		
	}


}