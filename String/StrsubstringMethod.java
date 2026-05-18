//String substring(int startindex) : this method is used for extracting string from index to length and return as new string data.

import java.util.Scanner;
public class StrsubstringMethod{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		String substringg=str.substring(5);
		System.out.println(substringg);


	}

}