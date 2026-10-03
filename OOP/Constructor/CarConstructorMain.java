/*
12. Car Information

Create a Car class with:

company
model
price

Use a constructor to initialize values and store 5 car objects in an array.*/

import java.util.Scanner;
class CarConstructor{
	int price;
	String company;
	String model;
	
	CarConstructor(){
		System.out.println("Book Details");
	}
	
	CarConstructor(int price,String company,String model){
		this.price=price;
		this.company=company;
		this.model=model;
	}
	
	void display(){
		System.out.println(" price: "+price);
		System.out.println(" company: "+company);
		System.out.println(" model: "+model);
		
	}



}


public class CarConstructorMain{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		CarConstructor bk=new CarConstructor();
		CarConstructor arr[]=new CarConstructor[2];
		
		for(int i=0;i<arr.length;i++){
		   System.out.println("Enter price: ");
		  int price=sc.nextInt();
		
		  System.out.println("Enter company: ");
		  String company=sc.next();
		
		  System.out.println("Enter model: ");
          String model=sc.next();
		  
		  arr[i] = new CarConstructor(price, company, model);
		  
		   
		
		}
		for (int i = 0; i < arr.length; i++) {
            arr[i].display();
          }

	}


}