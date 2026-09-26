package org.TreeMap;

import java.util.*;

public class GrpStringByLength {
    public static void main(String[] args) {
        List<String> ls= Arrays.asList("Java","C","Python","Go","HTML","React");

        Map<Integer,List<String>> map=new TreeMap<>();

        for(String s:ls){
            int length=s.length();

            if(!map.containsKey(length)){
                map.put(length,new ArrayList<>());


            }
            map.get(length).add(s);
        }

        for(Map.Entry<Integer,List<String>> entry:map.entrySet()){
            System.out.println(entry.getKey()+"= "+entry.getValue());
        }

    }
}
