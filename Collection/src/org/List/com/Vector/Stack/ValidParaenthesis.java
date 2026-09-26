package org.List.com.Vector.Stack;

import java.util.Stack;

public class ValidParaenthesis {
    public boolean isValid(String s){
        Stack<Character> stack=new Stack<>();

        for(char ch:s.toCharArray()){
            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                char popElement = stack.pop();

                if ((popElement != '[' && ch == ']') ||
                        (popElement != '(' && ch == ')') ||
                        (popElement != '{' && ch == '}')) {

                    return false;
                }
            }

        }
        return true;
    }
    public static void main(String[] args) {
        ValidParaenthesis vs=new ValidParaenthesis();
           String s="(){[}]";
           if(vs.isValid(s)){
               System.out.println("Valid Paraenthesis");
           }else{
               System.out.println("not valid");
           }
    }
}




