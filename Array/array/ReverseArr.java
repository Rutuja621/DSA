/*
Q7. Write a java program to display the reverse array.

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.
*/
import java.util.*;
public class ReverseArr{
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		int [] arr=new int[5];
		System.out.print("Enter array Elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();	
		}
		
		// 1. Reversal logic (Two-pointer swap)
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // 2. Manual Printing (without toString)
        System.out.print("Reverse array = {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
		
	}


}