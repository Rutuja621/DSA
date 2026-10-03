package org.List.com.Vector;

import java.util.Scanner;
import java.util.Vector;

public class FindTargetElementInVector{
	
	public static void main(String [] arg){
		Vector <Integer> vc=new Vector<>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elements size: ");
		int size=sc.nextInt();

		System.out.println("Enter "+size+" elements to add in vector: ");
		for(int i=0;i<size;i++){
			int num=sc.nextInt();
			vc.addElement(num);
			
		}
		
		System.out.println("\n Enter target element: ");
		int target=sc.nextInt();
		
		System.out.println("\nVector Elements: ");
		
	    int position = vc.indexOf(target);

        if (position != -1) {
            System.out.println("Element present at index: " + position);
        } else {
            System.out.println("Element not found in the vector.");
        }
		
		
		
		
		
	

	}

}