package LambdaExpression;

import java.util.Scanner;

interface EvenOdd{
    public boolean check(int num);
}

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int num=sc.nextInt();
        EvenOdd e=(a) ->num%2==0;

        System.out.println(e.check(num));
    }

}
