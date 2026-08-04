package org.List.com.LinkedList;

import java.util.LinkedList;

public class GetMiddleElement {
    public static void main(String[] args) {
        LinkedList<Integer> ls=new LinkedList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);


        int middle=ls.get((ls.size()-1)/2);
        System.out.println(middle);


    }
}
