package Scenarios;

import java.util.*;
class Employee {
//instance variables
    private int employeeId;
    private String name;
    private String department;
    private double salary;
    private int experience;
    
//constructor
    public Employee(int employeeId, String name, String department,
                    double salary, int experience,
                    ) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
        
    }
//getter and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    

    @Override
    public String toString() {
        return employeeId + " - " + name +
                " - " + department +
                " - " + salary +
                " - " + experience +
                " years - "

    }
}
public class EmployeeManagementSystem {
    static Scanner sc = new Scanner(System.in);
//arraylist
    static ArrayList<Integer, Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
//employee details
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Find Employee By ID");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
           

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayAllEmployees();
                    break;

                case 3:
                    findEmployeeById();
                    break;

                case 4:
                    updateEmployee();
                    break;

                case 5:
                    deleteEmployee();
                    break; 

                case 12:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // 1. Add Employee
    static void addEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
       //user input
        if (employees.containsKey(id)) {
            System.out.println("Employee ID already exists!");
            return;
        }
         
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Experience: ");
        int experience = sc.nextInt();

        sc.nextLine();

       

        Employee employee = new Employee(
                id, name, department, salary,
                experience, location, status
        );

        employees.put(id, employee);

        System.out.println("Employee added successfully!");
    }

    // 2. Display All Employees
    static void displayAllEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("\n===== All Employees =====");

        for (Employee e : employees.values()) {
            System.out.println(e);
        }
    }

    // 3. Find Employee By ID
    static void findEmployeeById() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee employee = employees.get(id);

        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found!");
        }
    }

    // 4. Update Employee
    static void updateEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee employee = employees.get(id);

        if (employee == null) {
            System.out.println("Employee not found!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter New Name: ");
        employee.setName(sc.nextLine());

        System.out.print("Enter New Department: ");
        employee.setDepartment(sc.nextLine());

        System.out.print("Enter New Salary: ");
        employee.setSalary(sc.nextDouble());

        System.out.print("Enter New Experience: ");
        employee.setExperience(sc.nextInt());

        sc.nextLine();


        System.out.println("Employee updated successfully!");
    }

    // 5. Delete Employee
    static void deleteEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee removedEmployee = employees.remove(id);

        if (removedEmployee != null) {
            System.out.println("Employee deleted successfully!");
        } else {
            System.out.println("Employee not found!");
        }
    }

    
}