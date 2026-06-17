
//Check whether a string contains only digits.
public class CheckOnlyDigitsInString {

    public static void main(String[] args) {
        String str="123a45";

        boolean isDigit=true;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) <'0' || str.charAt(i)>'9'){
                isDigit=false;
                break;
            }
        }
        System.out.println(isDigit);
    }

}
