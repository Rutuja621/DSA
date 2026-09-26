public class Method_toString {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="rutuja";
        s1.age=23;


//        System.out.println(s1);
        System.out.println(s1.toString());

    }
}
class Student{
    String name;
    int age;

    //@Override
    //overriding toString method from object class(and print data as per our requirement)
    public String toString() {
        return (name+", "+age);//printing data
    }
}