

/*
here this annotatation tells compiler that
this is functional interface(has exactly only one abstract method and multiple static and default methods)
so when any one try to add another abstarct method it will give error
also gives error when interface is empty
 */

@FunctionalInterface
interface MyInterface{
    public void sayHello();

   // public void say();  (not allowed)


}

public class Main1{
    public static void main(String[] args) {
        /*anonymous class
        MyInterface d=new MyInterface() {
            @Override
            public void sayHello() {

            }
        }

         */

        //lambda expression
        MyInterface d=()-> System.out.println("Hello");
        d.sayHello();

        
    }

}

/*
interface child extends MyInterface{
    public void hello1();

}*/