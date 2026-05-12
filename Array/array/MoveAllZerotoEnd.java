/*
Q25. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.

*/

import java.util.*;
public class MoveAllZerotoEnd{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size: ");
		int size=sc.nextInt();

		int [] arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
		if(arr[size]==0){
			System.out.println("Empty array");
		}else if(arr[size]==1){
			System.out.println(arr[i]);
			
		}
		int nz=0,z=0;
		while(nz<arr.length){
			if(arr[nz] !=0){
				int temp=arr[nz];
				arr[nz]=arr[z];
				arr[z]=temp;
				nz++;
				z++;
				
			}else{
				nz++;
				
			}					
		}	
		}	
        // Manual print loop
        System.out.println("Updated Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");  
        }
		}


	}


