//Reverse a string.
public class ReverseString {
    public static void main(String[] args) {
        String str="rutuja";

        StringBuilder str1= new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            //The append() method in Java is used to add data to the end of an existing sequence of characters
            str1.append(str.charAt(i));
        }
        System.out.println(str1);
    }
}
