import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] args) {
        /*try {
//checked exception detected by compiler(file not found)
            FileInputStream fs = new FileInputStream("d:/abc.txt");

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("hello");*/

        //unchecked exception(divide by zero)
       try {
           int a=100,b=0,c;
           c=a/b;//aritmetic exception
           System.out.println(c);

       }catch (ArithmeticException e){
           System.out.println(e);
       }




    }
}
