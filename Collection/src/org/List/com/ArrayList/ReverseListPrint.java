package org.List.com.ArrayList;
import java.util.ArrayList;
public class ReverseListPrint {
    public static void main(String[] args) {
		


        ArrayList<String> list = new ArrayList<>();

        // Store strings
        list.add("Apple");
        list.add("Banana");
        list.add("Kiwi");
        list.add("Orange");
        list.add("Mango");

        //int count = 0;

        // Check string length
		
		int left =0;
		int right=list.size()-1;
        for (String str : list) {
			
			while(left<right){
				int temp=left;
				left=right;
				right=temp;
				
			}
			 System.out.println(str);
           
        }

       
    }
}

