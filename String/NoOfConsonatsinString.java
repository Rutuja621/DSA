//Count the number of consonants in a string.

public class NoOfConsonatsinString {
    public static void main(String[] args) {
        String str="rUtuja";
        int consonat=0;
        for (char ch:str.toCharArray()){
            if(ch >='a' && ch<='z' || ch>='A' && ch<='Z'){
                if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o'&& ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O'&& ch != 'U'){
                    consonat++;
                }
            }
        }
        System.out.println(consonat);
    }
}
