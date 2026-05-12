//find the sum of max subarray

import java.util.*;
public class MaxSumSubArray{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size");
		int size=sc.nextInt();
		
		int []arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter subarray size: ");
		int k=sc.nextInt();
		
		int currSum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<k;i++){
			currSum+=arr[i];
			
		}
		maxSum=currSum;
		for(int i=1;i<=size-k;i++){
			currSum=currSum-arr[i-1]+arr[i+k-1];
			if(currSum>maxSum){
				maxSum=currSum;
				
			}
			
		}
		System.out.println(maxSum);






	}


}