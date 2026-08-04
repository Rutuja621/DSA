package org.collection.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();//this is collection object
        al.add(10);
        al.add('c');
        al.add("rutuja");


        HashSet hs=new HashSet();//this also called as collection object
        hs.add(10);
        hs.add("rutuja");
        hs.add(5.6);

        //Here list is an interface which is reference and arraylist/linkedlist is child(class) which implements properties of list

        List ls=new ArrayList();
        List ls1=new LinkedList();

    }
}
