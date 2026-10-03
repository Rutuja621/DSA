//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     int a=10;//instance variable (not accessible in static method because static belongs to class and instance need to create an object)
    static boolean add(){// static method
        Main m=new Main();//object created to access instance variable static
        System.out.println(m.a);

        return false;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(Main.add());
    }

}
