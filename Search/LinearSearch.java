
import java.util.*;
public class LinearSearch{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		int []arr=new int[]{10,23,45,1,35};
		int key=3;
		int index=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
			 	index=i;
				break;
				}
		}
		
		if(index != -1){
			System.out.println("number found at "+index);
			
		}else{
			System.out.println("Number not found");
		}
		
	}
}