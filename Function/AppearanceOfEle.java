/*
Q27. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.
*/

import java.util.*;
public class AppearanceOfEle{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size of an array: ");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		boolean[] visited = new boolean[size];

        for (int i = 0; i < size; i++) {
            if (visited[i] == true) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " appeared " + count + " times");
		}
	}


}