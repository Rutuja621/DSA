package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LambdaWithComparator {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(50,3,20,1);

        numbers.sort((a,b) -> a-b);
        System.out.println(numbers);
    }
}
