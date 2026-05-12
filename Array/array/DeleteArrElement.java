/*
Q10. Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5
*/

import java.util.*;
public class DeleteArrElement{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		
		
		
		int [] arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		
		System.out.println("Enter a position to delete element: ");
		int delete=sc.nextInt();
		
		for(int i=0;i<size;i++){
			if(i==delete){
				continue;
				
			}
			System.out.print(arr[i]+" ");
			
		}
	   
		
	}






}