//String toLowerCase(): this method is used for convert your uppercase string to lowercase string

import java.util.Scanner;
public class StrlowerCaseMethod{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		String lower=str.toLowerCase();
		System.out.println("LowerCase String: "+lower);
		


	}

}