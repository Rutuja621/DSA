public class CheckPlaindromeStr {
    public static void main(String[] args) {
        String str = "aba";

        if (str == null) {
            System.out.println("String is null");
            return;
        }

        int left = 0;
        int right = str.length() - 1;


        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }


        if (isPalindrome) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
