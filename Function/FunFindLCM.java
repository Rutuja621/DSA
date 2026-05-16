import java.util.Scanner;

public class FunFindLCM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + findLCM(num1, num2));
        
        sc.close();
    }

   
    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0) return 0; // LCM with 0 is always 0
        
        int gcd = findGCD(a, b);
 
        return (a / gcd) * b;
    }

   
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
