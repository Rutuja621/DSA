import java.util.*;
public class ValidParaenthesis{
	public static void main(String [] arg){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an Paranthesis: ");
		String input=sc.next();
		
		
		 Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // 1. If we see an opening bracket, PUSH it
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            // 2. If we see a closing bracket, we check for a match
            else if (c == ')' || c == ']' || c == '}') {
                // If stack is empty, it means there's no opening bracket for this closer
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
				
				char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    isValid = false;
                    break;
                }
				   // 3. Final check: The stack must be empty (all opened brackets were closed)				
			}
		
		}
		
         if (isValid && stack.isEmpty()) {
            System.out.println("Result: Valid Parentheses");
            } else {
             System.out.println("Result: Invalid Parentheses");
          }






   }


}