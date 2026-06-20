//Find duplicate characters in a string.

public class DuplicateCharInString {
    public static void main(String[] args) {
        String str="rutujaa";
        String str1=" ";

        boolean []visited=new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(visited[i]){
                continue;
            }

            boolean isDuplicate = false;

            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    isDuplicate = true;
                    visited[j] = true;
                }
            }


            if (isDuplicate) {
                System.out.println("Duplicate character: " + ch);
            }






        }

    }
}
