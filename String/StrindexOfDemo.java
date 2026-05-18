// int indexOf(String): this method is used for search data in string if data found return its index and if data not found return -1.this method return first search value index 

import java.util.*;
public class StrindexOfDemo{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		int index=str.indexOf("morning");
		if(index != -1){
			System.out.println("String found");
			
		}else{
			System.out.println("String not found");
		}
		
	}



}