import java.util.Scanner;

public class RecursiveBinarySearch{
	public static int recursiveSearch(int[] arr, int target, int start, int end) {
        // Base case: element is not present
        if (start > end) {
            return -1;
        }

        // Calculate mid to avoid potential integer overflow
        int mid = start + (end - start) / 2;

        // Base case: element found
        if (arr[mid] == target) {
            return mid;
        }

        // Target is smaller than mid, search left subarray
        if (target < arr[mid]) {
            return recursiveSearch(arr, target, start, mid - 1);
        }

        // Target is larger than mid, search right subarray
        return recursiveSearch(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
        int[] sortedArray =new int[6] ;
		System.out.println("Enter an array 6 elements(ascending order): ");
		for(int i=0;i<sortedArray.length;i++){
			sortedArray[i]=sc.nextInt();
		}
        
		System.out.println("Enter target element: ");
		int target=sc.nextInt();
        
        int result = recursiveSearch(sortedArray, target, 0, sortedArray.length - 1);
        System.out.println("Element found at index: " + result);

	}
}

