//. Reverse the order of words in a sentence.

import java.util.Scanner;
public class ReverseOrderofWordsInSentence{
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter a sentence: ");
		String st=sc.nextLine();
		
		String []words=st.split(" ");
		String res="";
		
		for(int i=words.length-1;i>=0;i--){
			res +=words[i]+" ";
			
		}
		
		System.out.println(res.trim());
	}


}