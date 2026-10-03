/*
Create a class Student with:

private String name
private int age

Create:

setName()
setAge()
getName()
getAge()

In the main method:

Store the student's name and age.
Display them.*/

import java.util.Scanner;
class Demo{
	private String name;
	private int age;
	
	
	public void setName(String name){
			this.name=name;
		
	}
	
	public String getName(){
		return name;
			
	}
	
	public void setAge(int age){
			this.age=age;
		
	}
	
	public int getAge(){
		return age;
			
	}


}

public class EncapsulationDemo{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name1=sc.next();
		
		System.out.println("Enter age: ");
		int age1=sc.nextInt();
		
		Demo dm=new Demo();
		dm.setName("rutuja");
		System.out.println("\n"+dm.getName());
		
		dm.setAge(22);
		System.out.println(dm.getAge());
			
	}

}