package org.List.com.ArrayList;

import java.util.ArrayList;

/*
3. Find the Second Largest Element
Difficulty: Medium
Problem Statement
Given an ArrayList<Integer>, find the second largest unique element. If it does not exist, print an appropriate message.
Example
Input:
[12, 45, 67, 45, 89, 89]
Output:
67

 */
public class FindSecondLargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> as=new ArrayList<>();
        as.add(35);
        as.add(35);
        as.add(30);
        as.add(40);

        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;

        for(int sec:as){
            if (sec>largest){
                second_largest=largest;
                largest=sec;
            } else if (sec>second_largest && sec<largest) {
                second_largest=sec;
                
            }

        }
        if(second_largest==Integer.MIN_VALUE){
            System.out.println("second largest element does not exist: ");
        }else {
            System.out.println("Second largest element is : " +second_largest);
        }


    }
}
