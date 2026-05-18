//String concat(String): this method is used for combining two strings with each other and generating a new third string from it.

import java.util.Scanner;
public class StrconcatMethod{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a two strings: ");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		
		String concatination=str1.concat(str2);
		System.out.println(concatination);

	}
}