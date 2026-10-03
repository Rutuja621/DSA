import java.util.Scanner;

public class CheckDivisibleByThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number: ");
        int num=sc.nextInt();

        int count=0;
        int sum=0;
        for(int i=0;i<num;i++){
            if(i % 3==0 && i%5 !=0){
                count++;
                System.out.println(i);
                sum = sum+i;
            }


        }
        System.out.println("sum: "+sum);
        System.out.println("count: "+count);

    }
}
