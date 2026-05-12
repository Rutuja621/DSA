/*

Q22. Write a Java program to check whether two integer arrays are equal.
 Two arrays are considered equal if:
Both arrays have the same length
Corresponding elements at each index are exactly the same
Do not use inbuilt methods like Arrays.equals().
Input :- Array1 = {10, 20, 30, 40}
            Array2 = {10, 20, 30, 40}

Output :- Arrays are equal.
Explanation
First, check if the lengths of both arrays are equal
If lengths are different → arrays are not equal
If lengths are same, compare elements one by one using a loop
If any element mismatch is found → arrays are not equal
If all elements match → arrays are equal
*/

import java.util.*;
public class TwoIntArrEqual{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size of an array1: ");
		int size1=sc.nextInt();
		
		
		System.out.println("Enter a size of an array2: ");
		int size2=sc.nextInt();


		int [] arr1=new int[size1];
		
		int [] arr2=new int[size2];
		System.out.println("Enter the array1 elements: ");
		for(int i=0;i<size1;i++){
			arr1[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the array1 elements: ");
		for(int i=0;i<size2;i++){
			arr2[i]=sc.nextInt();
			
		}
		
		boolean areEqual = true;
        if (arr1.length != arr2.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    areEqual = false;
                    break;
                }
            }
        }

        if (areEqual) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

	}
}