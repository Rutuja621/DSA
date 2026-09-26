import java.util.Scanner;

public class SubarraySum {

    static int count = 0;

    static void findSubarrays(int[] arr, int index, int target) {

        if (index == arr.length) {
            return;
        }

        findFromIndex(arr, index, index, 0, target);

        findSubarrays(arr, index + 1, target);
    }


    static void findFromIndex(int[] arr, int start,
                              int current, int sum, int target) {

        if (current == arr.length) {
            return;
        }

        sum = sum + arr[current];

        if (sum == target) {

            System.out.print("Subarray: ");

            printArray(arr, start, current);

            System.out.println();

            count++;
        }

        findFromIndex(arr, start, current + 1, sum, target);
    }


    static void printArray(int[] arr, int start, int end) {

        if (start > end) {
            return;
        }

        System.out.print(arr[start] + " ");

        printArray(arr, start + 1, end);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        findSubarrays(arr, 0, target);

        System.out.println("Total = " + count);

    }
}