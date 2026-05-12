/*
Q4. Write a java program to display the reverse array. 
 
Input : Array = {1, 2, 3, 4, 5} 
Output : Reverse array = {5, 4, 3, 2, 1} 
Explanation : 
The last element becomes the first, and the first becomes the last by traversing from the end 
to the start. */


import java.util.*;
public class ReverseArr{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();//input size of array
		
		int [] arr=new int [size];//arr
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){//takes elements till length of an array
			arr[i]=sc.nextInt();	
		}
		
		System.out.println("Reversed Array: ");
		int temp=0;
		for(int i=1;i<size;i++){//second for loop for reverse the array elements
		      temp=arr[i];
			 

			System.out.print(" "+arr[i]);//print updated array elements
		 
		}

	}

}