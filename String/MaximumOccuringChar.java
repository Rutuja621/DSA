//Find the maximum occurring character.

public class MaximumOccuringChar{

    public static void main(String[] args) {
        // 1. Define string
        String text = "testddd";
        
        // 2. Create tracking array for character frequencies (ASCII size 256)
        int[] countArray = new int[256];
        
        // 3. Take a for loop to iterate over the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            // 4. Update the count for this specific character slot
            countArray[currentChar]++; 
        }
        
        // 5. Find the maximum occurring character
        int maxCount = -1;
        char maxChar = ' ';
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            // If this character's total count is bigger than our current max
            if (countArray[currentChar] > maxCount) {
                maxCount = countArray[currentChar]; // Update the highest count
                maxChar = currentChar;              // Remember the winning letter
            }
        }
        
        // 6. Print the character
        System.out.println("Maximum occurring character is: " + maxChar);
        System.out.println("It appeared " + maxCount + " times.");
    }
}

