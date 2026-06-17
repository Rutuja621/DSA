public class ContainsOnlyAlphabetsInString {
    public static void main(String[] args) {
        String str="abcdefg";
        boolean isAlphabet=true;

        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i) <'a' || str.charAt(i)>'z') && (str.charAt(i)<'A' || str.charAt(i)>'Z')){
                isAlphabet=false;
                break;
            }

        }
        System.out.println(isAlphabet);
    }
}
