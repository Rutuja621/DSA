/*
Q5. Write a function that accepts a number and prints its multiplication table up to 10.
Explanation
Use a loop from 1 to 10
Multiply number with loop variable
Print result inside function
*/

import java.util.*;
public class MultiplicationTable{
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		getTable(num);
	}
	
	public static void getTable(int num){
		int i=1;
		while(i<=10){
			int table=num*i;
			System.out.println(num+"*"+i+"="+table);
			i++;
			
		}
		
	}


}

