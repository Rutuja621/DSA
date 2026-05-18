//boolean endsWith(String): this method is used to check if a string ends with a specified data or not if ends with specified data return true otherwise return false.

import java.util.Scanner;
public class StrendsWithMethod{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		boolean isendsWith=str.endsWith("sh");
		if(isendsWith){
			System.out.println("String is endswith 'sh'");
		}else{
		System.out.println("String is not endswith 'sh'");
		}
	}



}