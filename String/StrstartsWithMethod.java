//boolean startsWith(String): this method is used to check if a string starts with specified data or not if yes return true otherwise return false.
import java.util.Scanner;
public class StrstartsWithMethod{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		boolean isstarsWith=str.startsWith("r");
		
		if(isstarsWith){
			System.out.println("String starts with 'r'");
			
		}else{
			System.out.println("String not starts with 'r'");
			
		}
		
		
	}


}