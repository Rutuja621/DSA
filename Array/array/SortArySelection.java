
//sort an array using selection sort
import java.util.Scanner;
public class SortArySelection{
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		
		
		int []arr=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Array after sort: ");
			for(int i=0;i<arr.length;i++){
				System.out.printf("%d ",arr[i]);
				
			}
		
	}


}