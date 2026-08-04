public class WaysPrintException {
    public static void main(String[] args) {
        try{
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            //e.getMessage();
           // System.out.println(e.toString());
           // e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
