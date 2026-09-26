import java.util.Scanner;

public class HappyNumber {

    static int sumOfSquare(int n) {

        if (n == 0) {
            return 0;
        }

        int digit = n % 10;

        return digit * digit + sumOfSquare(n / 10);
    }

    static boolean isHappy(int n) {

        if (n == 1) {
            return true;
        }

        if (n == 4) {
            return false;
        }

        return isHappy(sumOfSquare(n));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isHappy(n)) {
            System.out.println(n + " is a Happy Number");
        } else {
            System.out.println(n + " is Not a Happy Number");
        }

        sc.close();
    }
}