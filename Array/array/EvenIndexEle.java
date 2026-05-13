import java.util.*;
public class EvenIndexEle{
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size of an array: ");
		int size=sc.nextInt();
		
		int []arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++){
			if(i % 2==0){
				System.out.println(arr[i]);
			}
		}
		



	}


}