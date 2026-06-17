public class ContainsOnlyLowerCaseChar {
    public static void main(String[] args) {
        String str="abcdefg";
        boolean isLowerCase=true;

        for (int i = 0; i < str.length(); i++) {

            char ch=str.charAt(i);

            if(ch <'a' || ch>'z'){
                isLowerCase=false;
                break;
            }
        }
        System.out.println(isLowerCase);
    }

}
