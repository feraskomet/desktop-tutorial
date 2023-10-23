import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for subtotal and gratuity rate
        System.out.println("Enter the subtotal:");
        double subtotal = scanner.nextDouble();

        System.out.println("Enter the gratuity rate (like 15 for 15%):");
        double rate = scanner.nextDouble();

        // Calculate tip and total
        double tip = subtotal * rate / 100;
        double total = subtotal + tip;

        // Print the results
        System.out.println("The gratuity is $" + tip + " and total is $" + total);

        // Close the scanner to free up resources
        scanner.close();
    }
}
