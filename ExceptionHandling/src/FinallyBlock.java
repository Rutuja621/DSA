public class FinallyBlock {
    public static void main(String[] args) {
       /* try{
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }finally {
            System.out.println("I am finally block");
        }*/

        /*
        try{
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            System.out.println("I am finally block");
        }*/

        /*
        try{
            int a=100,b=2,c;
            c=a/b;
            System.out.println(c);
        }finally {
            System.out.println("I am finally block");
        }*/

        try{
            int a=100,b=2,c;
            c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("I am finally block");
        }
    }
}
