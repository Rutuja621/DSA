/*
Q4. Write a method that takes two integers and returns the greater number.
Explanation
Compare both numbers
Return the larger one
Method Signature - static int findMax(int a, int b)

Input - a = 12, b = 20
Output - Maximum = 20*/

import java.util.*;
public class ReturnGreaterNumFunc{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("a= ");
		int num1=sc.nextInt();
		System.out.print("b= ");
		int num2=sc.nextInt();
		
		int result=findMax(num1,num2);
		System.out.println("Maximum: "+result);
	    


	}
	
	public static int findMax(int num1,int num2){
		if(num1>num2){
			return num1;
		}else{
			return num2;
			
		}

	}
}