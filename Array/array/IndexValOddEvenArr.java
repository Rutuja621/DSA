/*
Q4. Write a Java program to display even & odd index values from an array.
Input:
 Array Size = 6
 Array Elements = 5 10 15 20 25 30
Output:
 Values at Even Index = 5 15 25
 Values at Odd Index = 10 20 30
Explanation:
Index starts from 0.
Even index positions are 0, 2, 4, ….
Odd index positions are 1, 3, 5, ….
We print the values according to their index category.
*/

import java.util.*;
public class IndexValOddEvenArr{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		int [] arr=new int [6];
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("Even elements index: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.println(i);
				
			}
		}
		
		System.out.println("Odd elements index: ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				System.out.println(i);
				
			}
		}
	}

}