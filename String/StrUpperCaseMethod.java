//String toUpperCase(): this method is used for converting lower case string to uppercase string and generating new string objects.

import java.util.Scanner;
public class StrUpperCaseMethod{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		String upper=str.toUpperCase();
		System.out.println("UpperCase String : "+upper);
 
	}

}