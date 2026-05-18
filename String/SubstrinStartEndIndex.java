// String substring(int statIndex,int endIndex): this method is used for extracting strings between two indexes.

import java.util.Scanner;
public class SubstrinStartEndIndex{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		String substringg=str.substring(5,10);
		System.out.println(substringg);
		
		
	}



}