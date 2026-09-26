import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparable implements Comparable<EmployeeComparable>{
    public static void main(String[] args) {
        ArrayList<EmployeeComparable> list=new ArrayList<>();
        list.add(new EmployeeComparable(101, "Rutuja", 50000));
        list.add(new EmployeeComparable(102, "Priya", 30000));
        list.add(new EmployeeComparable(103, "Amit", 70000));

        //Collections.sort(list);

        for (EmployeeComparable e : list) {
            e.display();
        }

    }
    int id;
    String name;
    int salary;

    EmployeeComparable(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    @Override
    public int compareTo(EmployeeComparable o) {
        return this.salary - o.salary;
    }
    public void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
