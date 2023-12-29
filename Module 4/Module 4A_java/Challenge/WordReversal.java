package Challenge;

public class WordReversal {
    public static void main(String... args) {
        String sentence = "I am the best Automation Tester";
        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }

    public static String reverseWords(String sentence) {
        int index = sentence.indexOf(' ');
        if (index == -1) {
            return sentence;
        }
        String firstWord = sentence.substring(0, index);
        String remainingWords = sentence.substring(index + 1);
        return reverseWords(remainingWords) + " " + firstWord;
    }
}




