/*
Q6. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
*/

import java.util.*;
public class SearchEleArrFoundOrN{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		int [] arr=new int[5];
		
		
		
		System.out.println("Enter elements in Array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		
		
		
		System.out.println("Enter search element: ");
		int search=sc.nextInt();
		boolean found=false;
		int index=-1;
		for(int i=0;i<arr.length;i++){
		if(arr[i]==search){
			found=true;
			index=i;
			break;
			
		}
		}
		
		if(found){
			System.out.println("Element: "+search+" found at index "+index);
			
		}else{
			
			System.out.println("Element: "+search+" not found ");
		}


	}
}