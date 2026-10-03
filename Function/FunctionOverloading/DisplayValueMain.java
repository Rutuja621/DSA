/*
4. Print Data of Different Types

Overload the method display() to print:

An integer.
A double value.
A string.*/



import java.util.Scanner;
class DisplayValue{
	public void display(int a){
		System.out.println("Integer value: "+a);
		
		
	}
	
	public void display(double a){
		System.out.println("double value: "+a);
		
		
	}
	
	public void display(String str){
		
		System.out.println("String: "+str);
		
	}
}

public class  DisplayValueMain{
	public static void main(String [] arg){
	
		DisplayValue dis=new DisplayValue();
		dis.display(10);
		dis.display(23.43);
		dis.display("rutuja");
		
		
	}

}