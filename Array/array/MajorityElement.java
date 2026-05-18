import java.util.Scanner;

public class MajorityElement {
	
    public static int majorityEle(int []arr) {
        int element = arr[0];
        int count = 1;


        for (int i = 1; i < arr.length; i++) {
            if (count == 0) {
                element = arr[i];
                count = 1;
            } else if (arr[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        
        int actualCount = 0;
        for (int num : arr) {
            if (num == element) {
                actualCount++;
            }
        }
        
       
        if (actualCount > arr.length / 2) {
            return element;
        } else {
            return -1; 
        }
        
    }

    public static void main(String [] arg) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        
        int []arr = new int[size];
        System.out.println("Enter a array elements: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		
        int result = majorityEle(arr);
        
        if (result != -1) {
            System.out.println("Majority Element is: " + result); 
        } else {
            System.out.println("No Majority Element exists in this array.");
        }
    }
}
