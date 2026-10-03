package org.List.com.Vector;

import java.util.Scanner;
import java.util.Vector;

public class StoreNElementsInVectorPrintCount{
	
	public static void main(String [] arg){
		Vector <Integer> vc=new Vector<>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elements size: ");
		int size=sc.nextInt();
		int count=0;
		System.out.println("Enter "+size+" elements to add in vector: ");
		for(int i=0;i<size;i++){
			int num=sc.nextInt();
			vc.addElement(num);
			count++;
			
		}
		
		
		System.out.println("\nVector Elements: ");
		
		for(int nums:vc){
			System.out.println(nums);
			
			
		}
		
		System.out.println("\nCount of vector elements: "+count);
		
		
		
	

	}

}