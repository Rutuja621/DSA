class Employee{

    //instance variables
    int empId;
    String name;
    String deptName;
    double Salary;

    //static variables
    static String companyName="Capjemini";
    static int employeeCount=0;

    Employee(int empId,String name,String deptName,double salary){
        this.empId=empId;
        this.name=name;
        this.deptName=deptName;
        this.Salary=salary;
    }

    void increaseSalary(double salary){
        Salary=Salary+salary;

    }

    void display(){
        System.out.println("empId: "+empId);
        System.out.println("name: "+name);
        System.out.println("deptName: "+deptName);
        System.out.println("Salary: "+Salary);
    }
}

public class EmployeeManagementScenario2 {
    public static void main(String[] args) {
    Employee []emp=new Employee[1000];




    emp[0]=new Employee(101,"Rahul","Accounts",30000);
    emp[1]=new Employee(102,"sneha","Accounts",25000);
    emp[2]=new Employee(201,"Rohit","Development",50000);

    emp[3]=new Employee(101,"Manav","Accounts",30000);

   //test case 1
        System.out.println("Total Employees: "+Employee.employeeCount);

        //test case 2

        emp[0].increaseSalary(1010);

        Employee.companyName="Congnizant";
        System.out.println("After updating company name: ");

        emp[0].display();
        System.out.println();
        emp[1].display();
        System.out.println();
        emp[2].display();
        System.out.println();
        emp[3].display();


    }
}
