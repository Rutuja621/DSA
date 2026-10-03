package LambdaExpression;

import java.util.Scanner;

interface Square{
    int calculate(int num);
}
public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();

        Square s=(a) ->a*a;
        System.out.println("Square of number"+s.calculate(num));
    }

}
