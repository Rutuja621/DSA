// Heirarchical

class Vehicle{
	public void start(){
		System.out.println("start");
	}

}

class Car extends Vehicle{
	
	public void driveCar(){
		System.out.println("drive car");
		
		
	}


}

class Bike extends Vehicle{
	public void rideBike(){
		System.out.println("ride bike");
		
	}


}

public class HeirarchicalMain2{
	public static void main(String [] arg){
		Bike k=new Bike();
		k.start();
		k.rideBike();
		
		Car c=new Car();
		c.start();
		c.driveCar();

   }
}