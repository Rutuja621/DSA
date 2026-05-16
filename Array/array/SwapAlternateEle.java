import java.util.Scanner;

public class SwapAlternateEle {
    
    public static void swapAlternate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
     
        int[] arr = new int[size];
        
 
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
       
        swapAlternate(arr);
       
        System.out.print("Array after swapping alternates: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
