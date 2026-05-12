/*
Q5. Write a java program to remove duplicated values from arrays. 
 
Input : Array = {10, 20, 20, 30, 40, 40, 50} 
Output : Unique elements = {10, 20, 30, 40, 50} 
Explanation: 
Traverse the array, check if element already exists before adding to result, thus avoiding 
duplicates.*/

import java.util.*;
public class RemoveDuplicate{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();//input size of array
		
		int [] arr=new int [size];//arr
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){//takes elements till length of an array
			arr[i]=sc.nextInt();//input val
			
			
		}
		
		 for (int i = 0; i < arr.length; i++) {//iterate through array till length
            boolean isDuplicate = false;//to check if element is duplicate or not'

            for (int j = 0; j < i; j++) {//to check duplicate elements from the array
                if (arr[i] == arr[j]) {
                    isDuplicate = true;//if true then break the loop
                    break;
                }
            }
            if (!isDuplicate) {//if not then print the elment
				System.out.print(arr[i] + " ");
			}
        }
          

	}


}