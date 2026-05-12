/*
Q20. Write a Java program to print all elements from an integer array that are greater than a given number.

Explanation
An integer array is given.
A number N is also given.
Traverse the array using a loop.
Compare each element with N.
If the element is greater than N, print it.
Input :- Array: 10 25 5 40 18
 Given Number: 20

Output :- Elements greater than 20 :
    25 40

*/

import java.util.*;
public class PrntEleGretrThnGivenNo{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter a number: ");
		int nmber=sc.nextInt();
		
		System.out.println("Element greater than given number: ");
		for(int i=0;i<size;i++){
			if(nmber<arr[i]){
				System.out.print(arr[i]+" ");
			}
			
		}
	}


}