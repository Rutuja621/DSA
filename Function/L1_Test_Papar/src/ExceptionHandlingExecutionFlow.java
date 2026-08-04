public class ExceptionHandlingExecutionFlow {
    public static void main(String[] args) {
       /* System.out.println("1");
        try {
            System.out.println("2");
            int a = 100, b = 0, c;
            c = a / b;//here exception is occured so it will not print remaining part it directly goes in catch block
            System.out.println("3");
            System.out.println("4");
            System.out.println(c);
            System.out.println("5");

        }catch (Exception e){//prints all the catch block
            System.out.println("6");
            System.out.println("7");
            System.out.println(e);
            System.out.println("8");
        }*/


        System.out.println("1");
        try {
            System.out.println("2");
            int a = 100, b = 2, c;
            c = a / b;//here there is no exception in this code so it will skip catch block and prints only try block
            System.out.println("3");
            System.out.println("4");
            System.out.println(c);
            System.out.println("5");

        }catch (Exception e){//not executed
            //catch block executes only when it gets exception in try block
            System.out.println("6");
            System.out.println("7");
            System.out.println(e);
            System.out.println("8");
        }
    }
}
