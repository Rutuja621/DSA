//Convert the first character to uppercase.

import java.util.Scanner;
public class ConvertFistChUpper{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String st=sc.next();
		
		String str="";
        
	    str=str+Character.toUpperCase(st.charAt(0));
		
		for(int i=1;i<st.length();i++){
			str=str+st.charAt(i);
		}
		System.out.println(str);
	}

}