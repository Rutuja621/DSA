/*Q2. Write a Java program to calculate the sum of all elements in an array.
Input:
 Array Size = 5
 Array Elements = 2 4 6 8 10
Output:
 Sum of array elements = 30
Explanation:
Initialize a variable sum = 0.
Traverse the array and keep adding each element to sum.
After the loop ends, sum will hold the total of all array elements.*/

import java.util.Scanner;
public class SumArrEle{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		int [] arr=new int[5];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			
			
		}
		System.out.println("Sum of Array elements: "+ sum);
		
		
	}

}