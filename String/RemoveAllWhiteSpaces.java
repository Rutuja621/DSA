public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String s="ru tu jaa";
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(!Character.isWhitespace(ch)){
                sb.append(ch);

            }
        }
        System.out.println(sb.toString()+" ");

    }
}
