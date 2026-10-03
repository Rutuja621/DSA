import java.util.Scanner;

class Employee {

   
    private int empId;
    private String empName;
    private double salary;

   
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();

        
        Employee e = new Employee();

      
        e.setEmpId(id);
        e.setEmpName(name);
        e.setSalary(sal);

      
        System.out.println("\nEmployee Details");
        System.out.println("Employee ID: " + e.getEmpId());
        System.out.println("Employee Name: " + e.getEmpName());
        System.out.println("Salary: " + e.getSalary());

       
    }
}