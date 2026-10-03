/*
1. Vehicle Management System
Scenario:
A transportation company manages Cars, Bikes, and Trucks. Every vehicle has a different way of calculating fuel consumption.
Question:
How would you design a calculateFuelConsumption() method using polymorphism?
*/

class Vehicle1{
	
	
	
	public void calculateFuelConsumption1(){
		System.out.println("calculate standard FuelConsumption");
		
	}
	
}

class Car1 extends Vehicle1{
	@Override
	
	public void calculateFuelConsumption1(){
		System.out.println("car consume 8 liters for 100km");
	}	
}

class Bike1 extends Vehicle1{
	@Override
	
	public void calculateFuelConsumption1(){
		System.out.println("bike consume 4 liters for 100km");
	}	
}

class Trucks1 extends Vehicle1{
	@Override
	
	public void calculateFuelConsumption1(){
		System.out.println("Truck consume 11 liters for 100km due to heavy load");
	}	
	
}
public class PolyMorphismScenario1{
	

	public static void main(String [] arg){
		Vehicle1 v=new Vehicle1();
		v.calculateFuelConsumption1();
		
		v=new Car1();
		v.calculateFuelConsumption1();


	}



}