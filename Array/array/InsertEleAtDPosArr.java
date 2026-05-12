/*
Q12. Write a program in java to insert an element at desired position from an array.
	Test Data :

	Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value :      200

	Expected Output : The new list is : 1 2 200 3 4 5
*/

import java.util.*;
public class InsertEleAtDPosArr{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		
		int [] arr=new int[size+1];
		System.out.println("Enter array elements: ");
		
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter a position you want to insert a new element: ");
		int position=sc.nextInt();
		
		
		System.out.println("Enter a element to insert: ");
		int val=sc.nextInt();
		for(int i=size;i>=position;i--){
			arr[i]=arr[i-1];
		
		}
		arr[position-1]=val;
		
		
		System.out.println("New List is: ");
		for(int i=0;i<=size;i++){
			System.out.println(arr[i]+" ");
		}

	}
}