package FunctionalInterfaces.Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> function=str ->str.length();
        BiFunction<String,String,Integer> biFunction=(x,y) -> x.length() + y.length();
        System.out.println(biFunction.apply("Hi","Rutuja"));
    }
}
