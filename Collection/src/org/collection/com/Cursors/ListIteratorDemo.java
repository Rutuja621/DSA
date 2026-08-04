package org.collection.com.Cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List ls=new ArrayList();
        ls.add(10);
        ls.add("rutuja");
        ls.add("misal");

        ListIterator itr=ls.listIterator();
        //traverse in forward direction
        while (itr.hasNext()){
            System.out.println(itr.next());//cursor moves forward or backword by using next()
        }
        System.out.println("-----------------------------");
        //traverse in backword direction
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }

        ls.add("chinke");
        System.out.println(ls);

        ls.remove(0);//provide index here to remove tho object
        System.out.println(ls);

        ls.set(0,100);//replace element
        System.out.println(ls);

    }
}
