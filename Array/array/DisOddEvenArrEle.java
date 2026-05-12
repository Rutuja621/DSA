/*
Q3. Write a Java program to display even & odd values from an array.
Input:
 Array Size = 6
 Array Elements = 11 20 33 42 55 60
Output:
 Even Values = 20 42 60
 Odd Values = 11 33 55
 
 Explanation:
Traverse the array element by element.
If an element is divisible by 2, it is even. Otherwise, it is odd.
Separate lists are displayed for even and odd values.

*/

import java.util.*;
public class DisOddEvenArrEle{
	public static void main(String [] arg){
	Scanner sc=new Scanner(System.in);	
	
	System.out.println("Enter size of the array: ");
	int size=sc.nextInt();
	
	int [] arr=new int[size];
	
	System.out.println("Enter array elements: ");
	for(int i=0;i<size;i++){
		arr[i]=sc.nextInt();
		
	}
	
	System.out.println("EVEN Element: ");
	for(int i=0;i<size;i++){
		
		if(arr[i]%2==0){
			
			System.out.println(arr[i]);
			
		}
	}
	
	System.out.println("ODD Element: ");
	for(int i=0;i<size;i++){
		
		if(arr[i]%2 != 0){
			System.out.println(arr[i]);
			
		}
		
		
	}
		
		
		
	}

}