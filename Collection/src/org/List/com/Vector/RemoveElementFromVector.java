package org.List.com.Vector;

import java.util.Scanner;
import java.util.Vector;

public class RemoveElementFromVector{
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements size: ");
		int size=sc.nextInt();
        Vector <Integer> vc=new Vector<>();
		System.out.println("Enter "+size+" elements to add in vector: ");
		
		for(int i=0;i<size;i++){
			int num=sc.nextInt();
			vc.addElement(num);
			
		}
		
		System.out.println("\n Enter target element to remove from vector: ");
		int target=sc.nextInt();
		
		
		if(vc.removeElement(target)){
			System.out.println("Element removed successfully");
			System.out.println("updated vector: "+vc);
			
		}else{
			System.out.println("target element not present in vector");
		}
		


	}



}