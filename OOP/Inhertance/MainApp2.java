/*
Question 2: Create a base class Vehicle with attributes brand and speed.
Create a child class Car that adds fuelType.
Display all details using inheritance.
Asked In Practice Assignment
Description
This program shows how a child class accesses parent properties and adds its own features.
Useful to understand data reuse using inheritance.

Input
Enter Brand: Toyota
Enter Speed: 120
Enter Fuel Type: Petrol

Output
Brand: Toyota
Speed: 120 km/h
Fuel Type: Petrol */

import java.util.Scanner;
class Vehicle{
	String brand;
	double speed;
	
	public Vehicle(String brand,double speed){
		this.brand=brand;
		this.speed=speed;
		
	}


}

class Car extends Vehicle{
	String fuelType;
	
	public Car(String brand,double speed,String fuelType){
	super(brand,speed);
	this.fuelType=fuelType;
	
	}
	
	public void getDetais(){
		System.out.println("Brand: "+brand);
		System.out.println("speed: "+speed);
		System.out.println("fuelType: "+fuelType);
		
	}



}

public class MainApp2{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Brand: ");
		String st=sc.next();
		
		System.out.println("Enter Speed: ");
		double speed=sc.nextInt();
		
		System.out.println("Enter fuel Type: ");
		String fuelType=sc.next();
		
		Car c=new Car(st,speed,fuelType);
		c.getDetais();
		
		
	}



}

