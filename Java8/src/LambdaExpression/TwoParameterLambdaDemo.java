package LambdaExpression;

@FunctionalInterface
public interface TwoParameterLambdaDemo {
    public int add(int a, int b);
}

class TwoParameters{
    public static void main(String[] args) {
        TwoParameterLambdaDemo t=(a,b) ->a+b;
        System.out.println("addition is: "+t.add(3,4));

    }
}
