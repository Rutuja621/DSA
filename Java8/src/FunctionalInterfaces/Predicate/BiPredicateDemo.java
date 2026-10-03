package FunctionalInterfaces.Predicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> check=(a,b) -> a>b;
        System.out.println(check.test(2,4)); // returns false 2>4
    }
}
