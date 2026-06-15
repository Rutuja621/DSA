//Count the number of digits in a string.
public class NoOfDigitsinString {
    public static void main(String[] args) {
        String str="55rutuja";
        int digit=0;
        for(char ch:str.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                digit++;
            }
        }
        System.out.println(digit);
    }
}
