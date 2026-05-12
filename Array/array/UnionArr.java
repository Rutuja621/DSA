/*
Q28. Write a java program to find the union array of two unsorted arrays.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]

Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique
*/


import java.util.Scanner;

public class UnionArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Array 1
        System.out.print("Enter size of array1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1]; // Corrected: Initialize the array
        System.out.println("Enter array1 elements: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input Array 2
        System.out.print("Enter size of array2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2]; // Corrected: Initialize the array
        System.out.println("Enter array2 elements: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // 1. Manually merge both into one array
        int[] combined = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            combined[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            combined[n1 + i] = arr2[i];
        }

        // 2. Print unique elements only
        System.out.print("Output: ");
        for (int i = 0; i < combined.length; i++) {
            boolean isDuplicate = false;
            // Check if combined[i] appeared before index i
            for (int j = 0; j < i; j++) {
                if (combined[i] == combined[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not found earlier, it's unique
            if (!isDuplicate) {
                System.out.print(combined[i] + " ");
            }
        }
    }
}
