package org.TreeMap;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(5,"Rutuja"); //follows sorting order but not follow insertion order
        map.put(1,"misal");
        map.put(2,"sakshi");
        map.put(4,"misal");
        System.out.println(map);

        System.out.println(map.ceilingKey(3));//returns key if it exitst otherwise null

        System.out.println(map.ceilingEntry(3));//returns key with value(returns greater key and value if searched key not found  )

        System.out.println(map.containsKey(1));//returns true if key exists otherwise false

        System.out.println(map.firstEntry());//returns first element by sorting

        System.out.println(map.floorEntry(3));//returns the smaller key if the give key is not present other wise  if key present returns that key and value
        //(lower than equals to)
        System.out.println(map.get(1));//returns key's value

        System.out.println(map.higherKey(3));//if key not present return higher key by current key(4)

        System.out.println(map.lowerKey(3));//if not present returns smaller key and value(2)

        System.out.println(map.keySet());//returns all only keys

        System.out.println(map.pollFirstEntry());//removes and returns first entry
        System.out.println(map.pollLastEntry());//removes last entry

        map.remove(1);//removes first entry(give key entry)

        map.replace(2,"rutuja");//replaces new values of specified key with old value
        System.out.println(map.size());//returns count of total entries

        System.out.println(map.subMap(2,5)); //returns all entries between from and to till 5-1=4
    }
}
