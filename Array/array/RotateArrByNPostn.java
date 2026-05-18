/*
Q24. Write a program in java to rotate an array by N positions ?
	
Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is: 12 14 18 20 22 25 27 0 3  6 9
*/

import java.util.*;
public class RotateArrByNPostn{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array element: ");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the position: ");
		int position=sc.nextInt();
		position %= arr.length; 
		while(position>0){
			int temp=arr[0];
			for(int i=1;i<arr.length;i++){
				arr[i-1]=arr[i];
	
			}
			arr[arr.length-1]=temp;
			position--;
		}
			  
	.for(int i=0;i<arr.length;i++)
               {
                 System.out.print(" "+arr[i]);
               }

		
		
		
		

	}

}