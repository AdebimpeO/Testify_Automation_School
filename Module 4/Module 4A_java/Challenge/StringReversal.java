package Challenge;

public class StringReversal {
        public static void main(String... args) {
            String inputString = "TestifyAutomation";
            String reversedString = reverseString(inputString);
            System.out.println("Reversed String: " + reversedString);
        }

        public static String reverseString(String str) {
            if (str.isEmpty()) {
                return str;
            } else {
                return reverseString(str.substring(1)) + str.charAt(0);
            }
        }
    }
