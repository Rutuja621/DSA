// Find the first repeated character.

public class FirstRepeatedChar {
    
    public static void main(String[] arg) {
        String s = "rutuja";
        
        int[] arr = new int[26];
        
        // 1. Fill the frequency array
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;        
        }
        
        // 2. Find the first character that has a count greater than 1
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] > 1) {
                System.out.println("First Repeated Character is: " + s.charAt(i));
                break; // <-- CRITICAL: This stops the loop instantly after the first match
            }
        }
    }
}
