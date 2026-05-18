// String trim(): this method is used for removing white spaces from beginning and ending.

import java.util.Scanner;
public class StrtrimMethod{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		System.out.println("String without trim: "+str);
		
		String trimMethod=str.trim();
		System.out.println(trimMethod);
		
		


	}



}