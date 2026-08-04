package org.List.com.LinkedList;

import java.util.LinkedList;

public class CheckLinkedListPalindrome {
    public static void main(String[] args) {
        LinkedList<Character> lst = new LinkedList<>();
        lst.add('R');
        lst.add('A');
        lst.add('D');
        lst.add('A');
        lst.add('R');
        // lst.add('D');

        int left = 0;
        int right = lst.size() - 1;

        if (lst.get(left).equals(lst.get(right))) {
            left++;
            right--;
            System.out.println("palindrome String");
        } else {
            System.out.println("not palindrome");
        }

    }
}
