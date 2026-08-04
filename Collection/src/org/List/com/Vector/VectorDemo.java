package org.List.com.Vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector vc=new Vector<>();
        vc.add(10);
        vc.add(20);
        System.out.println(vc);

        Vector<String> vc1=new Vector<>();
        vc1.add("rutuja");
        vc1.add(1,"misal");
       // vc1.addElement(23);
        //vc1.remove(0);

      // vc1.set(0,"misal");//updating element
        System.out.println(vc1);
        System.out.println("first element: "+vc1.firstElement());
        System.out.println("last element: "+vc1.lastElement());

        //iterating over the vector
        for(String fruit:vc1){
            System.out.println(fruit);

        }
}
}
