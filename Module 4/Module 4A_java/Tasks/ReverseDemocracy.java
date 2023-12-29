package Tasks;

public class ReverseDemocracy {
    public static void main(String... args) {
        String originalString = "DEMOCRACY";
        String reversedString = "";
        // function to reverse originalWord
        for (int i = 0; i < originalString.length(); i++) {
            reversedString = originalString.charAt(i) + reversedString;
        }
        // print the word COME at a particular index
        System.out.println(reversedString.substring(4, 8));

    }
}
