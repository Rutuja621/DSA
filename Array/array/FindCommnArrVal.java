/*
Q15. Write a java program to find common elements between two arrays.
Input :
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation :
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.
*/
import java.util.*;
public class FindCommnArrVal{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		
		int [] arr1=new int[size];
		
		int [] arr2=new int[size];
		
		System.out.println("Enter elements for Array2: ");
		for(int i=0;i<size;i++){
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter elements for Array2: ");
		for(int i=0;i<size;i++){
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("Common elements are: ");
		for(int i=0;i<size;i++){
			if(arr1[i]==arr2[i]){
				System.out.println(arr1[i]);
			}
		}
		
	}
}