import java.io.FileInputStream;

import java.io.IOException;

public class FinallyDemo{
    public static void main(String[] args) throws IOException {
        FileInputStream fs=null;
        try {
            fs=new FileInputStream("d:/abc.txt");

        } catch (Exception e) {
            System.out.println("File not found");
        }finally {
            //cleanup here
            if(fs != null) {
               fs.close();
            }
            System.out.println("File closed");
        }
    }
}
