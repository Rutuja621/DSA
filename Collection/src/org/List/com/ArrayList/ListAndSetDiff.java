package org.List.com.ArrayList;

import java.util.*;

public class ListAndSetDiff {
    public static void main(String[] args) {
        List l=new ArrayList<>();
        l.add(0,1);//we can give index position and value
        l.add(2);//we can also give values directly it automatically adds element to 1 index
        l.add(3);//adds in 2 position
        l.add(3);//duplicate element
        l.add(null);
        l.add(null);//can have multiple null values
        System.out.println(l);



       /* Iterator it=l.iterator();//iterate one by one over all the elements in the list
        while (it.hasNext()){
            System.out.println(it.next());//moves to next element and prints the value
        }*/

        //using list iterator

        ListIterator ls=l.listIterator();
        while (ls.hasNext()){
            System.out.println(ls.next());
        }



        Set s=new HashSet<>();
        s.add(100);//it doesn't need index not an index based
        //s.add(1,3); not allowed
        //doesn't follow insertion order elements are stored in any order
        s.add(200);
        s.add(300);
        s.add(400);
        s.add(400);//only shows one 400 not two doesn't allow duplicate elements
        s.add(null);//doesnt allow multiple null only one null is allowed
        s.add(null);//shows only one null

        System.out.println(s);//400 100 200 300

        //using iterator
        Iterator it=s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
