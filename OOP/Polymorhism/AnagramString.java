//Check whether two strings are anagrams.

import java.util.Scanner;
public class AnagramString{
	public static void main(String [] arg){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string1");
		String atr1=sc.nextLine();
		
		System.out.println("Enter a string2");
		String atr2=sc.nextLine();
		
		int freq[]=new int[256];
		boolean isAnagram=true;
		
		if(atr1.length() != atr2.length()){
			System.out.println("Not a anagrams");
			return;
		}
		for(int i = 0; i < atr1.length(); i++) {
			freq[atr1.charAt(i)]++; // Increment for string 1
			freq[atr2.charAt(i)]--; // Decrement for string 2
		}
		
		for(int i=0;i<freq.length;i++){
			if(freq[i] != 0){
				isAnagram=false;
				break;
				
			}
			
		}
		
		if(isAnagram){
			System.out.println("They are anagrams");
		}else{
			System.out.println("Not an anagrams");
		}
	}




}