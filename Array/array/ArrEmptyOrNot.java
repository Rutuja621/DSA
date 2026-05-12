/*

Q18. Write a Java program to check whether a given array is empty or not.

Explanation
Every array has a predefined property called length.
If array.length == 0, then the array is empty.
Otherwise, the array contains elements.

Input :- Array elements: { }
Output :- Array is empty

*/

public class ArrEmptyOrNot{
	public static void main(String [] arg){
		int [] arr={ };
		
		if(arr.length==0){
			System.out.println("Array is empty");
		}else{
			System.out.println("Array is not empty");
		}
		
	}




}