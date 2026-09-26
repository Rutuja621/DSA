package org.HashMap;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap();
        hm.put(101,"rutuja");
        hm.put(102,"misal");
        hm.put(103,"sakshi");
        hm.put(104,"misal");

        hm.put(111,null);//not follows insertion and sorting order
        hm.put(222,null);
        System.out.println(hm);

        //methods
        System.out.println(hm.isEmpty());
        System.out.println(hm.remove(101));

        //new way

        //direct way (but we have specify the generic types) for each loop
        for (Map.Entry me:hm.entrySet()){
            System.out.println(me.getKey()+"-->"+me.getValue());

        }
/*
      //old way
        Set set=hm.entrySet();//convert map to set
        System.out.println(set);
        Iterator itr= set.iterator();
        while(itr.hasNext()){
          //  System.out.println(itr.next());//iterate over all entries
              Map.Entry entry=(Map.Entry) itr.next();
            //entry interface methods
           // System.out.println(entry.getKey());
        //    System.out.println(entry.getValue());

            System.out.println(entry.getKey()+"-->"+entry.getValue());

        }*/
    }
}
