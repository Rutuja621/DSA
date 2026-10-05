package LambdaExpression;
@FunctionalInterface
interface MyInterface{
    String getName();
}
public class UseLambdaExpression {
    public static void main(String[] args) {
        //functional interface act as datatype for lambda expression
        //lambda expression is a implementation of that single abstract method of functional interface thats why only one method present in abstarct method
        //there are multiple functional interfaces introduced in java 8 to work with lambda expression

        //before java 8 Anonymous inner classes were commonly used which requires More lines of code,only abstarct methods are allowed

        //after java 8 Lambda expressions can be used to reduce more lines of code  ,default and static methods are allowed,@FunctionalInterface annotation introduced

        MyInterface myInterface=() ->"software engineer";
        System.out.println(myInterface.getName());
        MyInterface editor=() ->"Editor";
        System.out.println(editor.getName());

    }
}
