package Tasks;
import java.util.Scanner;
public class LogicInputUser {
    public static void main (String... args) {
        //Write a logic that takes in input from the user.keeps printing "try again until the user enters "testify
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a word: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("testify")) {
                break;
            } else {
                System.out.println("Try again");
            }
        }
    }
}

