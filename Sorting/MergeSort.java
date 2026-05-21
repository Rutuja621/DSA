//merge sort 
import java.util.*;

public class MergeSort{
	
	public int sortedArray(int []nums){
		if(nums==null || nums.length<=1){
			return nums;			
		}
		
		int []temp=new int[nums.length];
		
		mergeSort(nums,0,nums.length-1,temp);
		return nums;


	}
	
	private void mergeSort(int[] nums, int left, int right, int[] temp) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid, temp);
        mergeSort(nums, mid + 1, right, temp);
        merge(nums, left, mid, right, temp);
    }

	
	    private void merge(int[] nums, int left, int mid, int right, int[] temp) {
        for (int k = left; k <= right; k++) {
            temp[k] = nums[k];
        }

        int i = left;
        int j = mid + 1;
        int curr = left;

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                nums[curr++] = temp[i++];
            } else {
                nums[curr++] = temp[j++];
            }
        }

        while (i <= mid) {
            nums[curr++] = temp[i++];
        }
    }
		
		
	

	
	
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size of an array");
		int size=sc.nextInt();
		
		int[]arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			
			arr[i]=sc.nextInt();
		}
		int []result=sortedArray(arr);
		System.out.println(Arrays.toString(result));

		
		
		
		
		
	}



}
