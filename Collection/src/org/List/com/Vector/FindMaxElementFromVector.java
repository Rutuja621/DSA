package org.List.com.Vector;

import java.util.Scanner;
import java.util.Vector;

public class FindMaxElementFromVector{
	
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
		

		
		int maxElement=0;
		for(int num:vc){
			if(num>maxElement){
				maxElement=num;
				
			}
		
		}
		System.out.println("\nMaximum element in vector: "+maxElement);
		
		}
		
		}