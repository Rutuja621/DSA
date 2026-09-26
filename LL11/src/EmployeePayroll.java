import java.util.Scanner;

class Employee {

    private int employeeId;
    private String employeeName;
    private String department;
    private String designation;
    private double basicSalary;
    private int experience;
    private double rating;

    // Parameterized Constructor
    Employee(int employeeId, String employeeName, String department,
             String designation, double basicSalary,
             int experience, double rating) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.designation = designation;
        this.basicSalary = basicSalary;
        this.experience = experience;
        this.rating = rating;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public int getExperience() {
        return experience;
    }

    public double getRating() {
        return rating;
    }

    // Setter
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Display Employee
    public void display() {
        System.out.println(
                employeeId + "  " +
                        employeeName + "  " +
                        department + "  " +
                        designation + "  " +
                        basicSalary + "  " +
                        experience + "  " +
                        rating
        );
    }
}


public class EmployeePayroll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        // Add Employees
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Employee " + (i + 1) + " Details");

            System.out.print("Employee ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Designation: ");
            String designation = sc.nextLine();

            System.out.print("Basic Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Experience: ");
            int experience = sc.nextInt();

            System.out.print("Rating: ");
            double rating = sc.nextDouble();

            employees[i] = new Employee(
                    id,
                    name,
                    department,
                    designation,
                    salary,
                    experience,
                    rating
            );
        }


        // 1. Display all employees
        System.out.println("\n----- ALL EMPLOYEES -----");

        for (int i = 0; i < n; i++) {
            employees[i].display();
        }


        // 2. Search Employee by ID
        System.out.print("\nEnter Employee ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (employees[i].getEmployeeId() == searchId) {

                System.out.println("Employee Found:");
                employees[i].display();

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }


        // 3. Update Salary using Experience
        System.out.print("\nEnter Employee ID to update salary: ");
        int updateId = sc.nextInt();

        for (int i = 0; i < n; i++) {

            if (employees[i].getEmployeeId() == updateId) {

                double oldSalary = employees[i].getBasicSalary();

                if (employees[i].getExperience() > 5) {

                    double newSalary = oldSalary + oldSalary * 0.10;

                    employees[i].setBasicSalary(newSalary);

                    System.out.println("Salary updated by 10%.");

                } else {

                    System.out.println(
                            "Experience is not greater than 5 years."
                    );
                }
            }
        }


        // 4. Delete Employee
        System.out.print("\nEnter Employee ID to delete: ");
        int deleteId = sc.nextInt();

        for (int i = 0; i < n; i++) {

            if (employees[i].getEmployeeId() == deleteId) {

                for (int j = i; j < n - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[n - 1] = null;

                System.out.println("Employee deleted.");

                n--;
                break;
            }
        }


        // 5. Find Highest Salary Employee
        if (n > 0) {

            Employee highest = employees[0];

            for (int i = 1; i < n; i++) {

                if (employees[i].getBasicSalary()
                        > highest.getBasicSalary()) {

                    highest = employees[i];
                }
            }

            System.out.println("\n----- HIGHEST SALARY -----");
            highest.display();
        }


        // 6. Employees with experience > 5 years
        System.out.println(
                "\n----- EXPERIENCE GREATER THAN 5 YEARS -----");

        for (int i = 0; i < n; i++) {

            if (employees[i].getExperience() > 5) {
                employees[i].display();
            }
        }


        // 7. Rating >= 4.5
        System.out.println(
                "\n----- RATING GREATER THAN OR EQUAL TO 4.5 -----");

        for (int i = 0; i < n; i++) {

            if (employees[i].getRating() >= 4.5) {
                employees[i].display();
            }
        }


        // 8. Department-wise Total Salary
        System.out.println("\n----- DEPARTMENT WISE SALARY -----");

        for (int i = 0; i < n; i++) {

            boolean alreadyPrinted = false;

            // Check whether department was already processed
            for (int k = 0; k < i; k++) {

                if (employees[k].getDepartment()
                        .equalsIgnoreCase(
                                employees[i].getDepartment())) {

                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {

                double total = 0;

                for (int j = 0; j < n; j++) {

                    if (employees[j].getDepartment()
                            .equalsIgnoreCase(
                                    employees[i].getDepartment())) {

                        total += employees[j].getBasicSalary();
                    }
                }

                System.out.println(
                        employees[i].getDepartment()
                                + " : " + total);
            }
        }


        // 9. Sort employees by salary descending
        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (employees[i].getBasicSalary()
                        < employees[j].getBasicSalary()) {

                    Employee temp = employees[i];

                    employees[i] = employees[j];

                    employees[j] = temp;
                }
            }
        }


        System.out.println(
                "\n----- EMPLOYEES BY SALARY DESCENDING -----");

        for (int i = 0; i < n; i++) {
            employees[i].display();
        }

        sc.close();
    }
}