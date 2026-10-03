//single inheritance

class Vehicle{
	public void start(){
		System.out.println("start");
		
	}



}

class Car extends Vehicle{
	public void drive(){
		System.out.println("Drive");
		
	}


}

public class Single2App{
	public static void main(String [] arg){
		Car cr=new Car();
		cr.start();
		cr.drive();
	}


}