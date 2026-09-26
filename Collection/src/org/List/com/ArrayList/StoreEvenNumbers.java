package org.List.com.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
.Question Statement
Write a Java program to accept an integer array from the user, store only even numbers into an ArrayList, and display the elements.
Description
Read array elements
Check each number
Store even numbers in ArrayList
Input
Array: 1 2 3 4 5 6
Output
Even Numbers: [2, 4, 6]
 */
public class StoreEvenNumbers {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements: ");
        int n=sc.nextInt();

        int []arr=new int[n];
        ArrayList ar=new ArrayList<>();

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();


            if(arr[i] % 2==0){
                ar.add(arr[i]);
            }
        }

        System.out.println(ar);





    }
}
