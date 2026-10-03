package org.List.com.Vector;

import java.util.Scanner;
import java.util.Vector;


public class FindEvenNumsInVector{
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements size: ");
		int size=sc.nextInt();
        Vector <Integer> vc=new Vector<>();
		System.out.println("Enter "+size+" elements to add in vector: ");
		
		for(int i=0;i<size;i++){
			
			vc.addElement(sc.nextInt());
			
		}
		
		System.out.println("\nEven elements in vector: ");
		
		for(int nums:vc){
			if(nums % 2==0){
				System.out.println(nums);
				
			}
			
		}


	}


}