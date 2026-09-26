package org.TreeMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FindCountOfWordinString {
    public static void main(String[] args) {
        //store sentence in list
        List<String> sentences= Arrays.asList("Java is powerful","python is language","Java is popular","Java is easy");

        //use treemap
        Map<String,Integer> map=new TreeMap<>();

        //convert sentence into word
        for(String sentence:sentences) {
            String[] words = sentence.split(" ");

            for(String word:words){
                word.replaceAll("[^A-Za-z]","");
                word=word.toLowerCase();

                if(map.containsKey(word)){
                    map.put(word,map.get(word)+1);


                }else{
                    map.put(word,1);

                }
            }



        }
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());

        }


    }
}
