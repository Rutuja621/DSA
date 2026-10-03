package FunctionalInterfaces.Function;

import java.util.function.Function;

public class FunctionInterfaceDemo {

    public static void main(String[] args) {


        //
        Function<Integer,Integer> doubleNum=x -> x*2;
        Function<Integer,Integer> addFive=x -> x+5;

        //<Integer,Integer> doubleNum=x -> x*2;
        //abstract method -> apply() -> Applies the operation to the input and returns the result.
         System.out.println(doubleNum.apply(5));

        //default method -> andThen() -> Executes the current function first(doubleNum), then the next(addFive) function.
        System.out.println(doubleNum.andThen(addFive).apply(10));

        //default method -> compose() ->Executes the given function first, then the current function.
        System.out.println(doubleNum.compose(addFive).apply(10));
    }
}
