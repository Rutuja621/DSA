package LambdaExpression;

@FunctionalInterface
interface GetData{
    public int getData(int a,int b);
}

public class LambdaWithMultipleStmt {
    public static void main(String[] args) {
        //multiple statements
        GetData d=(a,b) ->{
            int result=a+b;
            return result;
        };

        System.out.println(d.getData(2,4));
    }
}
