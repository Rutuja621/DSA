/*
1. Reverse a String (LC 344) 
Given a string, write a program to reverse the sequence of characters and return the reversed 
string. The solution should handle all characters correctly while maintaining the original 
character values. 
Example: Input: "hello" → Output: "olleh"*/


import java.util.Scanner;
public class ReverString{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter a string: ");
		String st=sc.nextLine();
		
		
		String reversed="";
		
		 for (int i = input.length() - 1; i >= 0; i--) {
            // Pick each character and add it to our new string
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

	}

}