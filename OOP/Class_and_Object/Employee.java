import java.util.Scanner;

public class Employee{
	int eid;
	String ename;
	int esalary;
	
	public void setData(int id,String name,int salary){
		eid=id;
		ename=name;
		esalary=salary;
		
		
	}
	
	public void getData(){
		System.out.println("Employee id: "+eid);
		System.out.println("Employee name: "+ename);
		System.out.println("Employee salary: "+esalary);
		
		
	}
	
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee id: ");
		int id=sc.nextInt();
		
		System.out.println("Enter Employee name: ");
		String name=sc.next();
		
		System.out.println("Enter Employee salary: ");
		int salary=sc.nextInt();
		
		Employee emp=new Employee();
		emp.setData(id,name,salary);
		emp.getData();
		
	}



}