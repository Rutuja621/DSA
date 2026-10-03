package FunctionalInterfaces.Consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> string=x -> System.out.println(x);
        string.accept("Rutuja");

        Consumer<Integer> val=x -> System.out.println(x *2 );
        val.accept(3);

        //consumer consumes input but returns nothing abstract method is void
    }
}
