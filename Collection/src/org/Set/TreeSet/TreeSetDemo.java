package org.Set.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        //internally uses treemap

    /*    ts.add(10);//allows sorting order
        //not index based
        ts.add(20);
        ts.add(30);  //by default ascending order(increasing)
        ts.add(40);*/


        ts.add("Rutuja");
        ts.add("Sakshi");
        ts.add("Rohit");
        ts.add("Ruturaj");
       // ts.add(null);(null values not allowed) (NullPointerException)
        ts.remove("Ruturaj");
        System.out.println(ts);



    }
}
