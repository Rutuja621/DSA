package FunctionalInterfaces.Predicate;

import java.util.function.Predicate;



public class PredicateDemo {
    public static void main(String[] args) {
        /*
        Predicate<Integer> isEven=x -> x%2==0;
        System.out.println(isEven.test(2));

         */

/*
        //coverts string to lower and cheks char at 0 th position is v or not(true or false)
        Predicate<String> isLetter=x ->x.toLowerCase().charAt(0)=='v';
        System.out.println(isLetter.test("iVo"));

 */

        Predicate<String> startsWithLetter=x ->x.toLowerCase().charAt(0)=='r';
        Predicate<String> endsWithLetter=x ->x.toLowerCase().charAt(x.length()-1)=='j';

        //and -> returns true if both conditions are true
        Predicate<String> and=startsWithLetter.and(endsWithLetter);
        System.out.println(and.test("rutuja"));

        //or -> if any condition is true then returns true
        Predicate<String> or=startsWithLetter.or(endsWithLetter);
        System.out.println(or.test("rutuja"));

        //negate -> reverses the condition it will give false if condition is true and if condition is false then returns true
        System.out.println(startsWithLetter.negate().test("rutuja"));







    }
}
