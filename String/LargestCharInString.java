//Find the largest character in a string.
public class LargestCharInString {
    public static void main(String[] args) {
       String str="JavaCode";
       char maxChar=' ';

       for (int i=0;i<str.length();i++){
           if(str.charAt(i)>maxChar){
               maxChar=str.charAt(i);

           }
       }
        System.out.println(maxChar);

    }
}
