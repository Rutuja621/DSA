import java.util.Scanner;

public class SwapAlternateEle {
    // Method to swap alternate elements
    public static void swapAlternate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // 2. Initialize the array
        int[] arr = new int[size];
        
        // 3. Take array elements as input from the user
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // 4. Perform the alternate swap
        swapAlternate(arr);
        
        // 5. Print the modified array
        System.out.print("Array after swapping alternates: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        scanner.close(); // Close scanner to release resources
    }
}
