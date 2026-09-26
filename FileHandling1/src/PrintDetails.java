import java.io.File;

public class PrintDetails {
    public static void main(String[] args) {
        int count=0;
        File f=new File("C:\\Program Files\\Java");
        String[] s = f.list();

        for(String s1: s){
            count++;
            System.out.println(s1);
        }
        System.out.println("Total number count: "+count);

    }



}
