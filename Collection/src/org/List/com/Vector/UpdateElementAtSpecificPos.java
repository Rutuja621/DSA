package org.List.com.Vector;

import java.util.Scanner;
import java.util.Vector;

public class UpdateElementAtSpecificPos{
	public static void main(String [] arg){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements size: ");
		int size=sc.nextInt();
        Vector <Integer> vc=new Vector<>();
		System.out.println("Enter "+size+" elements to add in vector: ");
		
		for(int i=0;i<size;i++){
			
			vc.addElement(sc.nextInt());
			
		}
		
		System.out.println("Enter a element to add in vector: ");
		int ele=sc.nextInt();
		
		System.out.println("Enter a position to add element: ");
		int pos=sc.nextInt();
		
		 if (pos >= 0 && pos < vc.size()) {
           
            int oldElement = vc.set(pos, ele); 
            
            System.out.println("Element updated in vector....");

            System.out.println("Updated vector: " + vc);
        } else {
            System.out.println("Index beyond the vector size! Valid indices are 0 to " + (vc.size() - 1));
        }
		
		


	}



}