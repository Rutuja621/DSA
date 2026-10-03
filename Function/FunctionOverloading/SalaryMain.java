import java.util.Scanner;

class Salary {

    private String name;
    private double salary;


    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void incrementSalary(double percentage) {
        salary = salary + (salary * percentage / 100);
    }
}

public class SalaryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Increment Percentage: ");
        double percentage = sc.nextDouble();

        Salary emp = new Salary();

        emp.setName(name);
        emp.setSalary(salary);

        emp.incrementSalary(percentage);

        System.out.println("\nEmployee Name: " + emp.getName());
        System.out.println("Updated Salary: " + emp.getSalary());

    }
}