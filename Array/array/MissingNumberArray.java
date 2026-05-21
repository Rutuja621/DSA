import java.util.Scanner;

public class MissingNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array  elements :");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

    
        System.out.println("The missing number is: " + missingNumber);
        

    }
}
