package org.List.com.ArrayList;

import java.util.ArrayList;

public class ArrayListConstructorDemo {

    public static void main(String[] args) {
        //Constructs an empty list with an initial capacity of ten.
        ArrayList <Integer> arrayList=new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println(arrayList);

        //Constructs an empty list with the specified initial capacity.
        //Params:
        //initialCapacity – the initial capacity of the list
        ArrayList <Integer> arrayList1=new ArrayList<>(7);
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        System.out.println(arrayList1);

    }
}
