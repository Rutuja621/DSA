

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
	    if(age >= 18){
		
		return age;
		}else{
		    return 0;
		}
			
	}


}

public class EligibilityDemo{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name1=sc.next();
		
		System.out.println("Enter age: ");
		int age1=sc.nextInt();
		
		Demo dm=new Demo();
		dm.setName(name1);
		System.out.println("\n"+dm.getName());
		
		dm.setAge(age1);
		
		
		if(dm.getAge() != 0){
		   System.out.println("You are eligible for voting");
		}else{
		   System.out.println("You are not eligible for voting");
		}
			
	}

}
