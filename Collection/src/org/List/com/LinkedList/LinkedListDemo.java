package org.List.com.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        //follows insertion order but not sorting order
        ls.add("rutuja");//we can add different type of data
        ls.add(21);
        ls.add('c');
        ls.add('c');//allows duplicate data elements

        ls.add(null);
        ls.add(null);//allows null and multiple null values

        System.out.println(ls);

        LinkedList <Integer>ls1=new LinkedList<>();//we can use generics
        ls1.add(10);
        ls1.add(20);
        System.out.println(ls1);

        ls1.addFirst(34);
        ls1.addLast(45);
        System.out.println(ls1);

        ls1.remove();//removes first element
        System.out.println(ls1);

        ls1.removeFirst();
        System.out.println(ls1);
        ls1.addLast(40);
        ls1.addLast(42);
        ls1.removeLast();
        System.out.println(ls1);





    }
}
