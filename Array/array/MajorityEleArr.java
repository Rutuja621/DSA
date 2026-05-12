/*
Q23. Write a Java program to find the Majority Element of an array.
A majority element in an array of size n is an element that appears more than n/2 times. There can be at most one majority element in the array.
Example :- The given array is: 4 8 4 6 7 4 4 8
       There are no Majority Elements in the given array
Explanation
Traverse the array using two loops.
For each element, count how many times it appears.
If the count of any element is greater than n/2, that element is the majority element.
If no such element is found after checking all elements, print that there is no majority element.
*/

import java.util.*;
public class MajorityEleArr{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter size of an array element: ");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		
		 int n = arr.length;
        boolean majorityFound = false;
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		
		
		 for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                System.out.println("Majority Element: " + arr[i]);
                majorityFound = true;
                break;
            }
        }

        if (!majorityFound) {
            System.out.println("No Majority Element found");
        }
    }
		
		
		
	}


