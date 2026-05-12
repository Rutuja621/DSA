/*
Q8. Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.
*/

import java.util.*;
public class MissingElemenArr{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[5];
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter range: ");
		int max=sc.nextInt();
		
		System.out.print("Missing elements = ");
        for (int i = 1; i <= max; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) found = true;
            }
            if (!found) System.out.print(i + " ");
        }
        
	}
			

}