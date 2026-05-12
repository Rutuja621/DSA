/*
Q11. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).
*/


import java.util.*;
public class SecLargeEleArr{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();		
		}	
		int largest=arr[0];
		int secondLargest=arr[0];
		for(int i=1;i<size;i++){
			if(arr[i]>largest){
				secondLargest=largest;
				largest=arr[i];
				
			}else if(arr[i]>secondLargest && arr[i]<largest){
				secondLargest=arr[i];
			}
		}
		System.out.println("secondLargest: "+secondLargest);
	}
}