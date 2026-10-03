import java.util.Scanner;

public class DigitLSSum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        int largeDigit=Integer.MIN_VALUE;
        int smallDigit=Integer.MAX_VALUE;

        int evenCount=0;
        int oddCount=0;

        int sum=0;

        while(temp>0){
            int digit=temp%10;
            sum += digit;
            if(digit>largeDigit){
                largeDigit=digit;

            }

            if(digit<smallDigit){
                smallDigit=digit;
            }

            if(digit % 2==0){
                evenCount++;
            }else{
                oddCount++;
            }

             temp /=10;

        }
        System.out.println("Largest digit: "+largeDigit);
        System.out.println("Smallest digit: "+smallDigit);
        System.out.println("Even count: "+evenCount);
        System.out.println("Odd count: "+oddCount);
        System.out.println("sum of all digit: "+sum);
    }
}
