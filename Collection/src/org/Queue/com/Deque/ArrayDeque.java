package org.Queue.com.Deque;

import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;

public class ArrayDeque {
    public static void main(String[] args) {
        Deque dq=new java.util.ArrayDeque();
        dq.add("Fisrt");
        dq.add("Second");
        dq.add("third");
        dq.add("third");//allows duplicates
        //dq.offerFirst(null); null values not allowed NullPointerException
      //  dq.addLast(40);
        //dq.addFirst(50);
        dq.pop();//removesFirstElement
        dq.pop();
      //  System.out.println(dq.peek());//returns first element

        System.out.println(dq);

    }
}
