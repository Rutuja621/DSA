import java.util.*;
public class ReverseString{
	/*
	public static String reverse(String st){
		 Stack<Character> stack = new Stack<>();
        
        // 1. Push all characters into the stack
        for (int i = 0; i < st.length(); i++) {
            stack.push(st.charAt(i));
        }
        
        // 2. Build the reversed string using basic concatenation (+)
        String result = "";
        while (!stack.isEmpty()) {
            result = result + stack.pop();
        }
        
        return result;
			
		}*/
	    public static void main(String [] arg){
		
         Stack<Character> input = new Stack<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String st = sc.next();
        
        // 1. Put characters into the stack
        for (int i = 0; i < st.length(); i++) {
            input.push(st.charAt(i));
        }
        
        // 2. Take them out (they will come out in reverse order)
        System.out.print("Reversed string: ");
        while (!input.isEmpty()) {
            System.out.print(input.pop());

	}

  }
}