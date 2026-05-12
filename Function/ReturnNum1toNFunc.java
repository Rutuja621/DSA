/*
Q6. Write a recursive function that prints numbers from 1 to N.
Explanation:
The function should print the current number.
It should call itself with the next number.
Stop when the number becomes greater than N.
Example:
 Input: N = 5
 Output: 1 2 3 4 5
*/

import java.util.*;
public class ReturnNum1toNFunc{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a N number: ");
		int n=sc.nextInt();
		
		getNumbers(1,n);
		
	}
	
	public static void getNumbers(int current,int n){
		
		
		while(current>n){
			return;
		}
		System.out.print(current+" ");
		
		getNumbers(current+1,n);
		
	}

}