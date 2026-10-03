// Reverse each word in a sentence.

import java.util.Scanner;
public class ReverseWordInSentence{
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String input = sc.nextLine();
        String[] words = input.split(" ");
        String result = "";

        for (String word : words) {
           
            result += new StringBuilder(word).reverse() + " ";
        }

        
        System.out.println(result.trim()); 
		
	}


}
