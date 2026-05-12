/*
Q5. Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
Explanation:
Initialize counters: evenCount = 0, oddCount = 0.
For each element in the array:


If divisible by 2 → increase evenCount.
Otherwise → increase oddCount.


Final counts are displayed.
*/


import java.util.*;

public class CountEvenOddValueArr{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		
		
		int [] arr=new int[size];
		
		System.out.println("Enter array element: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Even Element count: ");
		int count=0;
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				
				count++;
			}
			
		}System.out.println(count);
		
		
		System.out.println("Odd Element count: ");
		 count=0;
		for(int i=0;i<size;i++){
			if(arr[i]%2!=0){
				
				count++;
			}
		}System.out.println(count);

	}
}