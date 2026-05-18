
//String [] split(String): split method is used for splitting the string using some specified string data.

import java.util.Scanner;
public class StrsplitMethod{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		String []splitS=str.split("m");
		for(String s:splitS){
			
			System.out.println(s);
		}
		
		
	}



}