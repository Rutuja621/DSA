// multilevel inhertance

class Animal{
	
	public void eat(){
		System.out.println("Eat");
		
	}



}

class Dog extends Animal{
	public void bark(){
		System.out.println("Dog Barks");
	}


}

class Puppy extends Dog{
	public void weep(){
		System.out.println("Weeps");
		
	}


}

public class MultiLevelMain1{
	public static void main(String [] arg){
		
		Puppy p=new Puppy();
		p.eat();
		p.bark();
		p.weep();
	}


}