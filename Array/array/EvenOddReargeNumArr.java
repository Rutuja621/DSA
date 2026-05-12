/*
Q29. Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
Explanation:
Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
The relative order within even and odd groups may not be important, but alternation is maintained.
*/


import java.util.*;
public class EvenOddReargeNumArr{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size: ");
		int size=sc.nextInt();
		
		 int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		
		int []output=new int[size];
        int evenIdx = 0; // Pointer for even positions: 0, 2, 4...
        int oddIdx = 1;  // Pointer for odd positions: 1, 3, 5...

        for (int i = 0; i < size; i++) {
            // Check if number is even AND if there is space in an even slot
            if (arr[i] % 2 == 0 && evenIdx < size) {
                output[evenIdx] = arr[i];
                evenIdx += 2;
            } 
            // Check if number is odd AND if there is space in an odd slot
            else if (arr[i] % 2 != 0 && oddIdx < size) {
                output[oddIdx] = arr[i];
                oddIdx += 2;
            }
            // Optional: Handle cases where one type of number exceeds its allocated slots
        }

        System.out.println("Rearranged Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(output[i] + " ");
        }
	}


}