//16. Find the ASCII value of each character.

public class ASCIIValChar {
    public static void main(String[] args) {
        String str="Abcd";

        for(char c:str.toCharArray()){
          int ascii=(int) c;
          System.out.println(ascii);
        }
    }
}
