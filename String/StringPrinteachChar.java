
//Print each character of a string.

public class StringPrinteachChar {

    public static void main(String[] args) {
        String str = "rutuja";

        for(char ch : str.toCharArray()){
            //toCharArray() Converts this string to a new character array.
            System.out.println(ch);
        }
    }
}
