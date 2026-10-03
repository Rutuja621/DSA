import java.util.Scanner;

public class IdentifyNos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter n numbers");
        int n=sc.nextInt();

        int positiveCnt=0;
        int negativeCnt=0;
        int zeroCnt=0;

        int largestPositive=Integer.MIN_VALUE;
        int smallestNegative=Integer.MAX_VALUE;


        System.out.println("Enter "+n+" numbers: ");

        for(int i=0;i<n;i++){
            int num=sc.nextInt();

            if(num>0){
                positiveCnt++;

                if(num>largestPositive){
                    largestPositive=num;

                }

            } else if (num<0) {
                negativeCnt++;

                if(num<negativeCnt){
                    smallestNegative=num;
                }
                
            }else {
                zeroCnt++;
            }

        }

        System.out.println("Positive Number Count: "+positiveCnt);
        System.out.println("Negative Number count: "+negativeCnt);
        System.out.println("Zeros: "+zeroCnt);


        if(positiveCnt>0){
            System.out.println("Largest positive No: "+largestPositive);

        }else {
            System.out.println("No largest positive number found");
        }

        if(negativeCnt>0){
            System.out.println("Smallest negative number: "+smallestNegative);
        }else {
            System.out.println("No negative number found ");
        }


    }
}
