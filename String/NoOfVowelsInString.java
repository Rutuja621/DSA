public class NoOfVowelsInString {
    public static void main(String[] args) {
        String str="rUtuja";
        int vowel=0;
        for (char ch:str.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch == 'u' || ch == 'A' || ch == 'E' || ch=='I' || ch=='O' || ch == 'U'){
                vowel++;
            }
        }
        System.out.println(vowel);
    }
}
