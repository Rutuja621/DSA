public class HandleCode {
    public static void main(String[] args) {
        int a=100,b=0,c;
        c=a/b;//exception code
        System.out.println(c);
        //exception not handled here jvm will activate default exception handler
        //now lets handle this exception in another class (HandleException)

    }


}
