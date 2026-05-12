/*Q5. Write a Java program to find maximum difference such that larger element comes after smaller 
element. 
Input: 
Enter size: 7 
Enter elements: 2 3 10 6 4 8 1 
Output: Maximum difference is: 8*/

import java.util.*;
public class MaxDiff{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		
		int diff=0;
		for(int i=0;i<size;i++){

			for(int j=0;j<i;j++){
				diff=arr[i]-arr[j];
				
				if(diff>arr[i]-arr[j]){
					System.out.println("Max Diff is: "+diff);
				}
			}
			
		}
		
		
	}


}