package org.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;


public class HashSetDemo {
    public static void main(String[] args) {
        //hashset is not index based datastructure and stores values according hashcode values
        HashSet hs=new HashSet();
        hs.add(10);
        hs.add("rutuja");
        hs.add(34.5f);
        hs.add(true);
        hs.add("rutuja");//ignores duplicate element
        hs.add(null);//doesnot allow duplicate elements
        hs.add(null);

        //does not follow insertion.
        ArrayList list=new ArrayList();
        list.add(10);
        list.add("rutuja");
        list.add(34.5f);

        hs.addAll(list);
        System.out.println(list);

        // does not follow sorting order
        HashSet hs1=new HashSet();
        hs1.add(10);
        hs1.add(20);
        hs1.add(30);
        System.out.println(hs1);
        hs.clear();

        System.out.println(hs);
    }
}
