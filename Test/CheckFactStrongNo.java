import java.util.Scanner;

public class CheckFactStrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        int temp=num;
        int sum=0;

        while(temp >0){
            int digit=temp %10;
            int fact=1;

            for(int i=1;i<=digit;i++){
                fact=fact*i;

            }
            sum +=fact;
            temp /=10;

        }
        System.out.println("sum of factorial digits: "+sum);

        if(sum == num){
            System.out.println("the number is strong number");
        }else{
            System.out.println("the number is not a strong number");
        }
    }
}
