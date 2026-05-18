//char [] toCharArray(): this method is used for converting your string object into a primitive character array.

import java.util.Scanner;
public class ConvertCharArray{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		char []ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			System.out.printf("%c\t",ch[i]);
			
		}
 


	}


}