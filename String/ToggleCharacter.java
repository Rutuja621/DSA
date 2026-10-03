//Toggle the case of each character.

import java.util.Scanner;
public class ToggleCharacter{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.next();
		
		String st="";
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)){
				st=st+Character.toLowerCase(ch);
				
			}else if(Character.isLowerCase(ch)){
				st=st+Character.toUpperCase(ch);
				
			}else{
				st=str+ch;
			}
		}
		System.out.println(st);
		
	}


}