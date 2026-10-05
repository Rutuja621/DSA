package StaticOrDefaultMethods;


interface Demo{
    //deafult method with body  introduced after java 8
    default void sayHello(){
        System.out.println("Hello from parent");
    }
}

interface ChildDemo{
    default void sayHello(){
        System.out.println("Hello from child");
    }
}
public class DeafultMethodDemo implements Demo,ChildDemo {
    public static void main(String[] args) {
        //here both interfaces have same method so the compiler will confuse which one execute
        //here it will give an error
        DeafultMethodDemo dm=new DeafultMethodDemo();
        dm.sayHello();



    }

    //solution
    //override the method in class
    @Override
    public void sayHello() {
 //use reference which  interface's  method to execute
        Demo.super.sayHello();
        // ChildDemo.super.sayHello();

        System.out.println("My own implementation");
    }
}

