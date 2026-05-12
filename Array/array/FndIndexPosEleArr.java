/*
Q21. Given an integer array and a specific element, write a Java program to find the index position of that element in the array. If the element is not found, print -1.

Explanation
Traverse the array from index 0 to length - 1
Compare each element with the target element
If a match is found, return its index
If the loop ends and no match is found, return -1
Input :- Array: {10, 20, 30, 40, 50}
Element to find: 30


Output :- Element found at index: 2
*/

import java.util.*;
public class FndIndexPosEleArr{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter element to find index position: ");
		int target=sc.nextInt();
		int index=-1;
		System.out.println("Index of an given element: ");
		for(int i=0;i<size;i++){
			if(arr[i]==target){
				index=i;
				break;
			}	
		}System.out.print(index+" ");
	
	}

}