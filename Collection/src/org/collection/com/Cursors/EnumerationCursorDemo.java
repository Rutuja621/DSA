package org.collection.com.Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursorDemo {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(10);
        v.add("rutuja");

        Enumeration em=v.elements();

        //It checks whether there are more elements available in the collection
        while (em.hasMoreElements()){
            //Returns the next element from the collection.
            System.out.println(em.nextElement());
        }
    }
}
