package org.collection.com.Cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCursor {

    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(10);
        l.add("rutuja");//add elements as object not type of object
        l.add("rah");

        Iterator itr=l.iterator();
//iterator not add the elements
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        l.remove("rah");
        System.out.println(l);


    }
}
