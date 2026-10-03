import java.util.Scanner;

public class FactorsDetermineNumPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        int count=0;
        System.out.println("Factors of number: "+num+" ");

        for (int i = 1; i <=num; i++) {
            if(num %i==0){
                System.out.println(i+" ");
                count++;
            }
            
        }
        System.out.println();
        System.out.println("Total factors: "+count);

        if(count ==2){
            System.out.println(num+" is prime number");
        }else{
            System.out.println("The number is not a prime number");
        }
    }
}
