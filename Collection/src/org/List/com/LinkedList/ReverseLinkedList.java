package org.List.com.LinkedList;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ls=new LinkedList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);

      //  System.out.println(ls.reversed());//using inbuilt method

        int left=0;
        int right=ls.size()-1;

        while(left<right){
            int temp=ls.get(left);
            ls.set(left,ls.get(right));
            ls.set(right,temp);

           // left=ls.get(right);
           // right=temp;
            left++;
            right--;

        }
        System.out.println(ls);

    }
}
