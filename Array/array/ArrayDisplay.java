/*
Q1. Write a Java program to input an array & display it.
Input:
 Array Size = 5
 Array Elements = 10 20 30 40 50
Output:
 10 20 30 40 50
Explanation:
First, we take the size of the array from the user.
Then, elements are entered one by one into the array.
Finally, using a loop, we display all elements in the same order they were entered.


*/

import java.util.*;

public class ArrayDisplay{
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
	
       System.out.println("Enter size array: ");
	   int size=sc.nextInt();//size of the array
	   
	   //declare array
	   int[] arr= new int[size];
	   
	   //enter elements in a array
	   System.out.println("Enter Array Elements: ");
	   for(int i=0;i<size;i++){
		  arr[i]=sc.nextInt(); 
		   
	   }
	   
	   //display all elements
	   System.out.println("Array elements are: ");
	   for(int i=0;i<size;i++){
		  System.out.println(arr[i]+""); 
	   }
		
		
		
	}
}