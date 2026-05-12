/*
Q3. Write a Java program to move all zeros to the end of array without changing order of non-zero 
elements. 
Input: 
Enter size: 8 
Enter elements: 1 0 2 0 4 0 5 3 
Output: Modified array: 1 2 4 5 3 0 0 0*/

import java.util.*;
public class LastZero{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Updated array: ");
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				
			if(arr[i]==0){
				arr[j]=arr[i];
			}
			System.out.println(arr[i]);
			
		}
		}

	}

}