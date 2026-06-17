//Remove all special characters from a string.

public class RemoveAllSpecCHarInString {
    public static void main(String[] args) {
        String str = "abc#$123!hij";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a letter OR a digit
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                System.out.print(ch);
            }
        }
    }
}
