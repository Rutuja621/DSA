/*

Q16.Write a Java program to calculate the average of all elements present in an integer array.
Explanation
The average of array elements is calculated by:
 Average=Sum of all elementsNumber of elements\text{Average} = \frac{\text{Sum of all elements}}{\text{Number of elements}}Average=Number of elementsSum of all elements​
First, iterate through the array and add all elements to a variable sum.
Then divide sum by the total number of elements (array.length) to get the average.
Input Array:
 [10, 20, 30, 40, 50]
Output:
 Average of array elements = 30
*/


import java.util.*; 
public class AvgAllEleArr{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		System.out.println("Enter array elements: ");
		int sum=0;
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		
			
		System.out.println("Average of Array Elements: "+sum/arr.length);
		
		
		
	}



}
