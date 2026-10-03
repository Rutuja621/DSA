/*
Polymorphism with Interfaces
Different classes implement the same interface differently.*/


interface Shapes{
	void draw();


}

class Circle implements Shapes{
	public void draw(){
		System.out.println("circle");
	}
	
	
}

class Rectangle implements Shapes{
	public void draw(){
		System.out.println("Rectangle");
	}
	
}


public class PolymorphismInInterface{
	public static void main(String [] arg){
		Shapes s;
		s=new Circle();
		s.draw();
		
		s=new Rectangle();
		s.draw();
		
	}



}