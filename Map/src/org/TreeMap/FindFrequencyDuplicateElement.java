package org.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class FindFrequencyDuplicateElement {
    public static void main(String[] args) {
        int [] arr={10,20,30,10,40,20,30,50,60,10,1};
        Map<Integer,Integer> map=new TreeMap<>();

        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }

        }

        for(int num:map.keySet()){
            if(map.get(num)>1){
                System.out.println(num+"= "+map.get(num));
            }
        }

    }
}
