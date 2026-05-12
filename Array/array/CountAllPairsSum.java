/*
Q26. Write a java program to count all pairs of elements in an array whose sum is equal to a given number.
	
Input :- arr = [1, 5, 7, -1, 5]        sum = 6
Output :- 3
Explanation:
Pairs whose sum = 6 are:
(1, 5) → first occurrence
(7, -1)
(1, 5) → second occurrence (from the second 5)
Total pairs = 3
*/

import java.util.*;
public class CountAllPairsSum{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a array size: ");
		int size=sc.nextInt();
		
		int []arr=new int[size];
		
		System.out.println("Enter a array elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;
		System.out.println("Enter a sum: ");
		int sum=sc.nextInt();
		
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]+arr[j]==sum){
					count++;
					
				}
			}
		}
		System.out.println("Count: "+count);


	}




}

