import java.util.Scanner;
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();

    void push(int value){
        stack.push(value);

        if(minStack.isEmpty() || value<=minStack.peek()){
            minStack.push(value);
        }
    }


    void pop(){
     int x=stack.pop();

     if(x ==minStack.peek()){
         minStack.pop();
     }
    }



    int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MinStack minStack1=new MinStack();

        System.out.println("Enter element size: ");
        int n= scanner.nextInt();

        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            minStack1.push(scanner.nextInt());
        }

        System.out.println("Minimum Element is: "+minStack1.getMin());
    }
}
