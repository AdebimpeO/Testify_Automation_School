package Challenge;

public class PalindromeChecker {

    public static void main(String... args) {
        String str1 = "racecar";
        String str2 = "10801";

        if (isPalindrome(str1)) {
            System.out.println(str1 + " is a palindrome");
        } else {
            System.out.println(str1 + " is not a palindrome");
        }

        if (isPalindrome(str2)) {
            System.out.println(str2 + " is a palindrome");
        } else {
            System.out.println(str2 + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return true;
            }
            left++;
            right--;
        }
        return false;
    }
}

