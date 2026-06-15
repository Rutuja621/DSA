//. Find the length of a string without using `length()`.
public class FindStrLenWithoutLenFunc {
    public static void main(String[] args) {
        int count=0;
        String str ="rutuja";

        for (char ch : str.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
