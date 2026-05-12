/*
Q17. Write a Java program to count the number of even and odd elements present in a given integer array.
Explanation
An even number is a number that is completely divisible by 2.
An odd number is a number that is not divisible by 2.
Traverse the array using a loop.
Input :- Array = { 10, 15, 20, 25, 30 }
Output :- Even count = 3
    Odd count = 2
*/

import java.util.*;
public class CntNoofEvnOddEleArr{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			
		}
		int count=0;
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				count++;
			}
		}System.out.println("Even elements: "+count);
		
		count =0;
		for(int i=0;i<size;i++){
			if(arr[i]%2!=0){
				count++;
			}
		}System.out.println("Odd Elements: "+count);
	}


}