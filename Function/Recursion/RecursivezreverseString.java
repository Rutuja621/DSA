import java.util.Scanner;

public class RecursivezreverseString{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
	}
	
	 public static String reverseString(String str) {
        // Base case: if string is empty or has only one character
        if (str == null || str.length() <= 1) {
            return str;
        }
        
        // Recursive call: take the first character and move it to the end
        // str.substring(1) gets everything EXCEPT the first character
        return reverseString(str.substring(1)) + str.charAt(0);
    }


}