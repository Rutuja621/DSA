
//sort an array using bubble sort
import java.util.Scanner;
public class SortAryBubble{
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		
		
		int []arr=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array after sort: ");
			for(int i=0;i<arr.length;i++){
				System.out.printf("%d ",arr[i]);
				
			}
		
	}


}