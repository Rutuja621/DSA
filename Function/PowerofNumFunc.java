/*
No return value
Q8. Write a Java program that uses a void function to calculate power of a number using a loop.
Explanation
Pass base and exponent to the function
Multiply base repeatedly using a loop
Print the final result inside the function
*/

import java.util.*;
public class PowerofNumFunc{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a base and exponent: ");
		int base=sc.nextInt();
		int exponent=sc.nextInt();
		
		getPower(base,exponent);
		
		
	}
	
	public static void getPower(int base,int exponent){
		int i=1;
		int power=1;
		while(i<=exponent){
			power=power*base;
            i++;			
		}
		System.out.println(base+" power of "+exponent+" is : "+power);	
	}
}