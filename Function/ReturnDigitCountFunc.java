/*
Q5. Write a Java method that takes an integer and returns the count of digits in that number.
Explanation
Divide the number by 10 repeatedly
Count how many times division happens
Return the count
Method Signature - static int countDigits(int num)
Input - num = 4567
Output - Digits = 4
*/
import java.util.*;
public class ReturnDigitCountFunc{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int result=countDigits(num);
		System.out.println("Digits= "+result);



	}
	
	public static int countDigits(int num){
		int digits=0;
		int temp=num;
		while(temp>0){
			int digit=temp%10;
			digits++;
			temp/=10;
		}
		return digits;
		
	}

}