package org.List.com.Vector;

import java.util.Scanner;
import java.util.Vector;
public class VectorAddElements{
	public static void main(String [] arg){
		Vector<Integer> vc=new Vector<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements to add in Vector");
		for(int i=0;i<5;i++){
			int num=sc.nextInt();
			vc.addElement(num);
			
			
		}
		
		System.out.println("\nVector Elements");
		for(int nums: vc){
			System.out.println(nums);
		}



	}

}