package org.List.com.ArrayList;

import java.util.ArrayList;

/*
2. Merge Two Sorted ArrayLists
Difficulty: Easy–Medium
Problem Statement
Given two sorted ArrayList<Integer> objects, merge them into a single sorted ArrayList without using any built-in sorting method.
Example
Input:
List1 = [1, 3, 5]
List2 = [2, 4, 6]

Output:
[1, 2, 3, 4, 5, 6]

 */
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> as=new ArrayList<>();
        as.add(12);
        as.add(13);
        as.add(15);

        ArrayList<Integer> as1=new ArrayList<>();
        as1.add(16);
        as1.add(17);
        as1.add(18);

        ArrayList<Integer> mergedList=new ArrayList<>();
        //add elements of as to mergedList
        for(int i=0;i<as.size();i++){
            mergedList.add(as.get(i));
        }

        //add elements of as1 to mergedlist
        for (int i=0;i<as1.size();i++){
            mergedList.add(as1.get(i));
        }

        System.out.println(mergedList);

    }
}
