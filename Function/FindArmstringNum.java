import java.util.Scanner;

public class FindArmstringNum {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }
     
    }
    

    public static boolean isArmstrong(int num){
        int k = countDig(num);
        int sum = calPowSum(num, k);
        return sum == num;
    }
    
  
    private static int countDig(int num){
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count; 
    }
    
    private static int calPowSum(int num, int k){
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, k);
            num /= 10;
        }
        return sum;
    }
}
