public class ContainsOnlyUpperCaseLetter {
    public static void main(String[] args) {
        String str="ABCDE";
        boolean isUpperCase=true;

        for (int i = 0; i < str.length(); i++) {

            char ch=str.charAt(i);

            if(ch <'A' || ch>'Z'){
                isUpperCase=false;
                break;
            }
        }
        System.out.println(isUpperCase);
    }
}
