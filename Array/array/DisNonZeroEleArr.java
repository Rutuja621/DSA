/*
Q13. Write a java program to display only non-zero values from an array.
Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.
*/

import java.util.*;
public class DisNonZeroEleArr{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			
			
		}
		System.out.println("New Array elements are: ");
		for(int i=0;i<size;i++){
			if(arr[i]==0){
				continue;
				
			}
			
			System.out.println(arr[i]);
		}
		
		

	}
}