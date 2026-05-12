/*
Q9. Write a Java program using a void function to check whether a number is a Strong Number.
A Strong Number is a number whose sum of factorials of digits equals the number.
Explanation
Extract each digit
Calculate factorial using a loop (no recursion)
Add factorials
Compare with original number
Print result inside function
*/

import java.util.*;
public class StrongNumFunc{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		getStrongNum(num);
	}
	
    public static void getStrongNum(int num){
		int temp=num;
		int digit=0;
		while(temp>0){
			digit=temp%10;
			int i=1;
			int power=1;
			while(i<=digit){
				power*=i;
				i++;
			}
			
		}


	}



}