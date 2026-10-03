package LambdaExpression;

@FunctionalInterface
interface OneParaMeter{
    public void getName(String name);
}

public class LambdaWithOneParameter {

    public static void main(String[] args) {
        OneParaMeter o=(name) -> System.out.println("Heloo "+name);
        o.getName("Rutuja");
    }

}
