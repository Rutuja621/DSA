package StaticOrDefaultMethods;

interface StaticMethod {
    static void sayHello(){
        System.out.println("This is static method");
    }
}

public class StaicMethodDemo implements StaticMethod{
    public static void main(String[] args) {
        StaicMethodDemo st=new StaicMethodDemo();
       // st.sayHello();  we can not call static methods by creating object

        //we can call static method by interface_name.method_name

        StaticMethod.sayHello();

        //overriding of static method is not possible if we write same static method as parent
        //then it is not overriding it treat it as seperate method(static method of child class)

        



    }

}
