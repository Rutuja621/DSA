//4. Employee Salary Example (Popular Interview Question)


class Employee{
	public void calculateSalary(){
		System.out.println("calculating salary..");
	}


}

class FullTimeEmp extends Employee{
	public void calculateSalary(){
		System.out.println("your salary is :Rs 50000/-");
	}



}

class PartTimeEmp extends Employee{
	public void calculateSalary(){
		System.out.println("your salary is :Rs 25000/-");
	}


}

public class MainEmployee{
	public static void main(String [] arg){
		Employee emp;
		emp=new FullTimeEmp();
		emp.calculateSalary();
		
	}


}