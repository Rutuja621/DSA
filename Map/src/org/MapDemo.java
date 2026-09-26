package org;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map map=new HashMap<>();


        map.put(101,"rutuja");
        map.put(102,"misal");
        map.put(101,"123");//replaces value of this new duplicate with old key(duplicates are not allowed)
        map.put(null,"null_val");//always inserted first
        map.put(null,"asd");//duplicate null also not values replaces new vakue with old value
        System.out.println(map);

  //      map.clear();//remove all entries from map

        System.out.println(map.containsKey(101));//searches an entry based on specific key(return true if exists otherwise false)

        System.out.println(map.containsValue("rutuja"));//searches an entry based on specified key(if we enter an duplicte val and try get old value the it returns false)

        System.out.println(map.get(101));//search an entry(give value of specified key)

        System.out.println(map.hashCode());//returns hashCode of a map

     //   map.remove(101);//removes an specified entry

        map.isEmpty();//checks if map is empty and returns true if not returns false

        map.size();//return total number element exist in map

        System.out.println(map.replace(101,"rutuja"));//replace value with old value and return old value
        System.out.println(map);
    }
}
