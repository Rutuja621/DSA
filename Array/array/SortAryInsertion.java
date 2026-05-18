
//sort an array using insertion sort
import java.util.Scanner;
public class SortAryInsertion{
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		
		
		int []arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++){
			
				int key=arr[i];
				int j=i-1;
				
				while(j>=0 && arr[j]>key){
					arr[j+1]=arr[j];
					j--;
				}arr[j+1]=key;
			
		}
		
		System.out.println("Array after sort: ");
			for(int i=0;i<arr.length;i++){
				System.out.printf("%d ",arr[i]);
				
			}
		
	}


}