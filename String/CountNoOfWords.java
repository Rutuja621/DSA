//Count the number of words in a sentence.

public class CountNoOfWords {
    public static void main(String[] args) {
        String words="Java is fun";

        if(words ==null || words.trim().isEmpty()){
            System.out.println("not having words");
            return;
        }
        String[] word = words.split(" ");
        int count = 0;

        // Count only the items that are not empty spaces
        for (String wor : word) {
            if (!wor.isEmpty()) {
                count++;
            }
        }

        System.out.println("Word count: " + count);
    }
}
