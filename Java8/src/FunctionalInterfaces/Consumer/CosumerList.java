package FunctionalInterfaces.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CosumerList {
    public static void main(String[] args) {
        Consumer<List<Integer>> listConsumer=li ->{
            for(Integer i:li){
                System.out.println(i+100);

            }
        };

        Consumer<List<Integer>> listConsumer1=li ->{
            for(Integer i:li){
                System.out.println(i);

            }
        };

        listConsumer.andThen(listConsumer1).accept(Arrays.asList(1,2,3,4));
    }
}
