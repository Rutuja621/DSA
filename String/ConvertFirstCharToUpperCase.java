public class ConvertFirstCharToUpperCase {
    public static void main(String[] args) {
        String str="assbdf";

        String result=str.substring(0,1).toUpperCase()+str.substring(1);

        System.out.println(result);


    }
}
