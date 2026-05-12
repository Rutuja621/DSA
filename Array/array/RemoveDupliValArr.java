/*

Q14.  Write a java program to remove duplicated values from arrays.

Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.
*/

import java.util.*;
public class RemoveDupliValArr{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		int [] arr=new int[size];
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Unique elements = ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
				System.out.print(arr[i] + " ");
			}
        }
		
	}


}