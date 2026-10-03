//Find the frequency of every character in a string.

import java.util.Scanner;

public class FindFreqOfChar{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.next();
		
		int []fp=new int[256];
		for(int i=0;i<str.length();i++){
			
			char ch=str.charAt(i);
			fp[ch]++;
		}
		
		for(int i=0;i<fp.length;i++){
			if(fp[i]>0){
				System.out.println((char) i+" : "+fp[i]);
			}
			
		}
	}






}