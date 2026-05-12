/*
Q4. Write a function that accepts two integers and prints the greater number.
Explanation
Compare both numbers using if-else
Print the greater number
Function does not return anything
Example
Input: 15, 25
Output: Maximum number is 25
*/
import java.util.*;
public class TwoIntGreaterFunc{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 2 numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		getGreater(num1,num2);
		
	}
	
	public static void getGreater(int num1,int num2){
		if(num1>num2){
			System.out.println(num1+" is greater");
			
		}else{
			System.out.println(num2+" is greater");
			
		}
		
	}





}