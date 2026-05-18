import java.util.Scanner;

public class FindLeaderEle {
    public static void main(String [] arg) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        
        int []arr = new int[size];
        System.out.println("Enter a array elements: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Leaders in the array are: ");
        
        int maxFromRight = arr[size - 1];
        System.out.print(maxFromRight + " ");

        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
              
                System.out.print(maxFromRight + " "); 
            }
        }
    }
}
