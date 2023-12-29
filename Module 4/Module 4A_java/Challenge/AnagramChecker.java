package Challenge;
import java.util.*;
    public class AnagramChecker {
        public static void main(String... args) {
            String inputString = "Despite commuting at the peek hour, she was able to keep to time";
            String processedString = inputString.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (areAnagrams(processedString, "peekthe")) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }
        public static boolean areAnagrams(String str1, String str2) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            return Arrays.equals(charArray1, charArray2);
        }
    }