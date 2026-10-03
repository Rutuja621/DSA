import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        File f=new File("rutuja.txt");

        f.createNewFile();
        System.out.println(f.exists());

        FileWriter fw=new FileWriter("rutuja.txt");
        fw.write("hello this is the first file");
        System.out.println(f.length());


    }
}