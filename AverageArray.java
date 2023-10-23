import java.util.Scanner;

public class AverageArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a tool to get user input

        // Create an array to store 10 double numbers
        double[] numbers = new double[10];

        // Ask the user to enter 10 double numbers
        System.out.println("Enter ten double numbers:");

        // Loop to read each of the 10 numbers
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }

        scanner.close();  // Close the scanner after using it

        // Calculate and print the average of the entered numbers
        System.out.println("The average of the numbers you entered is: " + average(numbers));
    }

    // This method calculates and returns the average of a list of int numbers
    public static int average(int[] array) {
        int sum = 0;  // Start with a total of 0

        // Loop to add each number to the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Return the average by dividing the sum by the number of elements
        return sum / array.length;
    }

    // This method calculates and returns the average of a list of double numbers
    public static double average(double[] array) {
        double sum = 0;  // Start with a total of 0

        // Loop to add each number to the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Return the average by dividing the sum by the number of elements
        return sum / array.length;
    }
}