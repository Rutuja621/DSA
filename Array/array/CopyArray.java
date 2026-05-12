/*
Q9. Write a java program to copy one array to another array.
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment.

*/


import java.util.*;
public class CopyArray{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		int arr1[]=new int[5];
		int arr2[]=new int[arr1.length];
		
		System.out.println("Enter array1 elements: ");
		for(int i=0;i<arr1.length;i++){
		    arr1[i]=sc.nextInt();
			arr2[i]=arr1[i];
			
		}
		
		System.out.print("Elements of array2: ");
		
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
			
		}
	}

}