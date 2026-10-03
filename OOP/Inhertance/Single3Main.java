//single inheritance

class Person{
	
	String name;
	int age;
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}

}

class Student1 extends Person{
	int mark;
	public Student1(String name,int age,int mark){
		super(name,age);
		this.mark=mark;
		
		
	}
	
	public void DisplayDetails(){
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("mark: "+mark);
		
		
	}



}

public class Single3Main{
	public static void main(String [] arg){
		
		Student1 st=new Student1("rutuja",22,34);
		st.DisplayDetails();
		
	}


}