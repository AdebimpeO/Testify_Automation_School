
package Tasks;
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String... args) {
        Scanner amountInput = new Scanner(System.in);

        System.out.println("Input the principal amount in the field below");
        double principal = amountInput.nextDouble();

        System.out.print("Enter your interest rate (%): ");
        double rate = amountInput.nextDouble();

        System.out.print("For how long do you want this to run (in years): ");
        double time = amountInput.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Your Simple Interest for a period of " + time+" years" +" at " + rate+"% " + " is " + simpleInterest);

        amountInput.close();

    }
}
