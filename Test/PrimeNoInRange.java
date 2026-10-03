import java.util.Scanner;

public class PrimeNoInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter start value: ");
        int start=sc.nextInt();

        System.out.println("Enter end value: ");
        int end=sc.nextInt();

        int count=0;
        int sum=0;

        System.out.println("Prime numbers: ");
        for(int i=start;i<=end;i++){
            boolean isPrime=true;

            if(i<2){
                isPrime=false;
            }else{
                for (int j=2;j<i/2;j++){
                    if(i%j==0){
                        isPrime=false;
                        break;
                    }

                }
            }

            if(isPrime){
                System.out.println(i+" ");
                count++;
                sum+=i;
            }

        }


        System.out.println();
        System.out.println("Total number of primes: " + count);
        System.out.println("Sum of primes: " + sum);



    }
}
