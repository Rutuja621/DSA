package org.List.com.Vector;

import java.util.Scanner;
import java.util.Vector;

public class FindFirstAndLastElementFromVector{
	
	 public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements size: ");
		int size=sc.nextInt();
        Vector <Integer> vc=new Vector<>();
		System.out.println("Enter "+size+" elements to add in vector: ");
		
		for(int i=0;i<size;i++){
			
			vc.addElement(sc.nextInt());
			
		}
		
		System.out.println("\nFirstElement: "+vc.firstElement());
		System.out.println("\nLastElement: "+vc.lastElement());
		
		
		
		}
		
		}
		