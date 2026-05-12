/*
Q10. Write a Java program that uses a void function to print the Fibonacci series up to N terms.
Explanation
Pass number of terms to the function
Use loop to generate series
Print each term inside the function
No recursion and no return type
*/

import java.util.*;
public class FibonacciSeriesNFunc{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a N number: ");
		int n=sc.nextInt();
		
		getFiboSeries(n);
		
	}
	
	public static void getFiboSeries(int n){
		int i=1;
		int a=1,b=1;
		while(i<=n){
			System.out.println(a+" ");
			int sum=a+b;
			a=b;
			b=sum;
			i++;
		}
		
		
		
	}







}