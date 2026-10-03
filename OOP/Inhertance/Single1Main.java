// single inheritance 
import java.util.Scanner;
class Animal{
	public void eat(){
		System.out.println("Eat");
	}
}

class Dog extends Animal{
	public void bark(){
		System.out.println("dog barks");		
	}
}

public class Single1Main{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		// achieved single level inheritance(child can access parent class property)
		Dog dg=new Dog();
		dg.eat();
		dg.bark();		
		
	}

}