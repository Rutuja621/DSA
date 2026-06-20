public class CountUpperLowerCaseLetters {
    public static void main(String[] args) {
        String str="AbcSD";
        int lowerCase=0;
        int upperCase=0;

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z') {
                lowerCase++;
            }else if(ch>='A' && ch<='Z') {
                upperCase++;
            }

        }
        System.out.println("lowercase letters in string is: "+lowerCase);
        System.out.println("Upper case letters in string is:"+upperCase);
    }
}
