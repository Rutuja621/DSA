//Rotate array right

import java.util.Scanner;
public class RotateAryRight{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		
		int []arr=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();	
		}
		
		System.out.println("Enter a k element: ");
		int k=sc.nextInt();
		
		
		k %= size;
		 while(k > 0) {
           
            int temp = arr[size - 1]; 
            
           
            for(int i = size - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            
            arr[0] = temp;
            k--;
        }
		System.out.println("Rotated elemets: ");
		for(int i=0;i<size;i++){
		
			System.out.println(arr[i]+" ");
		}
	}




}