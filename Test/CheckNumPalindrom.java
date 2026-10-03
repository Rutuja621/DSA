import java.util.Scanner;

public class CheckNumPalindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        int originalNum=num;
        int reverse=0;

        //reverse a number
        while(num >0){
            int digit=num%10;
            reverse = reverse * 10+digit;
            num /=10;

        }
        System.out.println("reverse: "+reverse);

        if(originalNum == reverse){
            System.out.println("the number is palinfrome");

            if(originalNum %3==0 && originalNum%5==0){
                System.out.println("the number is divisible by both 3 and 5");
            }else{
                System.out.println("the number is not divisible by 3 and 5");
            }

        }else {
            System.out.println("the number is not palindrome");
        }
    }
}
