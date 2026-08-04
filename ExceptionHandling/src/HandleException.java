public class HandleException {
    public void getDivide(){
        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception");
        }


    }
    public static void main(String[] args) {
        HandleException hc=new HandleException();
        hc.getDivide();
        /*try {
            hc.getDivide();

        } catch (Exception e) {
            System.out.println("Exception");
        }*/



    }
}
