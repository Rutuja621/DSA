public class SmallestCharInString {
    public static void main(String[] args) {
        String str="JavaCode";
        char minChar=' ';

        for (int i=0;i<str.length();i++){
            if(str.charAt(i) <minChar){
                minChar=str.charAt(i);
            }
        }
        System.out.println(minChar);
    }
}
