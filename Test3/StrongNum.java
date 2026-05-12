/*
Q2. Write a java program to display 1 to nth Strong Number. 
Example : A Strong number is a number whose sum of factorial of digits is equal to the 
original number. */

import java.util.*;
public class StrongNum{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a N number");
		int n=sc.nextInt();//input
		System.out.println("Strong numbers between 1 to "+n+" is: ");
		for(int i=1;i<=n;i++){
			int temp=i;//to store i  val
			int sum=0;//to store the sum
			
			while(temp>0){
				int digit=temp%10;//to store the extracted digit
				int prod=1;////to store the factorial of digit
				int j=1;//to iterate through each digit
				
				while(j<=digit){//loop iterates till val j become <= digit
					prod*=j;//to store the factorial of each digit
					j++;//updates j after opration
				}
				sum+=prod;//stores the sum of digit
				temp/=10;//to remove the extracted num
				
			}
			
			if(sum==i){//checks if i == sum of all digits
				
				System.out.println(i+" ");//if condition true then prints i
			}
			
		}

	}

}