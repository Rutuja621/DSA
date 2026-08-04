package org.List.com.ArrayList;

import java.util.ArrayList;

/*
1. Remove Duplicates from an ArrayList
Difficulty: Easy
Problem Statement
Given an ArrayList<Integer> containing duplicate elements, remove all duplicate values while preserving the order of their first occurrence.
Example
Input:
[10, 20, 10, 30, 20, 40]

Output:
[10, 20, 30, 40]

 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> as=new ArrayList<>();
        as.add(10);
        as.add(20);
        as.add(30);
        as.add(10);
        as.add(30);
        System.out.println("Original list: ");
        for (int i:as){
            System.out.println(i);
        }

        ArrayList<Integer> uniqueEle=new ArrayList<>();
        for (int unique:as){
            if(!uniqueEle.contains(unique)){
                uniqueEle.add(unique);
            }
        }

        System.out.println("updated list\n"+uniqueEle);



    }
}
