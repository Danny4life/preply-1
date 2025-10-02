package filip.exercise2;

/**
 * function isPalindrome(str):
 *     if str is null:
 *         return false
 *
 *     normalize str:
 *         - remove spaces
 *         - convert to lowercase
 *
 *     left = 0
 *     right = length(str) - 1
 *
 *     while left < right:
 *         if str[left] != str[right]:
 *             return false   // mismatch found
 *         left = left + 1
 *         right = right - 1
 *
 *     return true  // no mismatches → it's a palindrome
 */

public class PalidromeChecker {

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Normalize the string (optional: remove spaces and make lowercase)
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // mismatch found
            }
            left++;
            right--;
        }
        return true; // no mismatches
    }

    public static void main(String[] args) {
        String word1 = "madam";
        String word2 = "Hello";
        String word3 = "Nan";

        System.out.println(word1 + " is palindrome? " + isPalindrome(word1));
        System.out.println(word2 + " is palindrome? " + isPalindrome(word2));
        System.out.println(word3 + " is palindrome? " + isPalindrome(word3));
    }

}
