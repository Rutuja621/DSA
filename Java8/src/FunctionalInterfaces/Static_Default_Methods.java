package FunctionalInterfaces;

interface MyDefault{
    default void sayHello(){
        System.out.println("This is Default Method");
    }
}

class Child implements MyDefault{
    
}
public class Static_Default_Methods {

}
