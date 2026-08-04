package org.List.com.Vector;

import java.util.Scanner;
import java.util.Vector;

public class CopyAllElementsFrmOneTOAnotherVector {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements size: ");
        int size=sc.nextInt();
        Vector<Integer> vc=new Vector<>();
        Vector<Integer> vc1=new Vector<>();

        System.out.println("Enter "+size+" elements to add in vector: ");

        for(int i=0;i<size;i++){

            vc.addElement(sc.nextInt());

        }
        System.out.println(vc1);
        vc1.addAll(vc);
        System.out.println(vc1);


    }
}
