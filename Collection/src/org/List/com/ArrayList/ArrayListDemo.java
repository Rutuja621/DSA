package org.List.com.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        System.out.println("Enter elements in arraylist: ");
        for(int i=0;i<=5;i++){
            int no= sc.nextInt();
            list.add(no);

        }

        System.out.println(list.remove(10));
    }
}
