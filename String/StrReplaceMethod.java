//String replace(): replace data in string 

import java.util.Scanner;

public class StrReplaceMethod{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		String replaceS=str.replace("morning","evening");
		System.out.println("Replaced String : "+replaceS);
	}




}