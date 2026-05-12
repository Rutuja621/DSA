/*
Q19. Given an integer array, replace all the negative numbers in the array with 0 and print the updated array.

Explanation
Traverse the array from the first element to the last.
Check each element:
If the element is negative, replace it with 0.
If the element is zero or positive, keep it as it is.
After completing the traversal, print the modified array.
Input :- Array = [5, -3, 7, -1, 0, -6, 4]

Output :- Updated Array = [5, 0, 7, 0, 0, 0, 4]
*/

import java.util.*;
public class ReplceNtiveNoZro{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();

		}
		System.out.println("Updated list: ");
		for(int i=0;i<size;i++){
			if(arr[i]<0){
				arr[i]=0;
			}
		System.out.print(" "+arr[i]);	
		}


	}


}