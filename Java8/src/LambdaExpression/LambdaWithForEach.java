package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LambdaWithForEach {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Rutuja","Sakshi");

        names.forEach(name-> System.out.println(name));
    }
}
