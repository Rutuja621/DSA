package org.List.com.Vector.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack st=new Stack<>();
        st.push(10);
        st.push("string");
        st.push(1.2);
        st.push(30);

        System.out.println(st.peek());//returns top most(last entered) element

        System.out.println(st.pop());//removes top most element
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);

        System.out.println(st.search(10));//gives position of 10 element from last entered element

        System.out.println(st.empty());
    }
}
