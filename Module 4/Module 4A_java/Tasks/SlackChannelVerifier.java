package Tasks;
import java.util.Scanner;
public class SlackChannelVerifier {
    public static void main(String... args) {
        verifyVisitorsOnSlackChannel();
    }

    public static void verifyVisitorsOnSlackChannel() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the purpose of your visit: ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("testify")) {
                System.out.println("Welcome to the Testify Trainings Slack channel!");
                break;
            } else {
                System.out.println("Sorry, you are not authorized to access this channel.");
            }
        }
    }
}
