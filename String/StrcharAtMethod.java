//char charAt(int index): this method is used for return character by using a specified index
import java.util.Scanner;
public class StrcharAtMethod{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++){
			System.out.printf("%d -----> %c\n",i,str.charAt(i));
			
			
		}



	}




}