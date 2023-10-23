import java.util.Scanner;

public class SimpleBMI {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Ask the user for their weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Ask the user for their height in feet
        System.out.print("Enter feet: ");
        int feet = input.nextInt();

        // Ask the user for their additional height in inches
        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        // Convert feet and inches to total height in inches
        int totalInches = (feet * 12) + inches;

        // Convert height from inches to meters (1 inch is 0.0254 meters)
        double heightInMeters = totalInches * 0.0254;

        // Convert weight from pounds to kilograms (1 pound is 0.453592 kilograms)
        double weightInKilograms = weight * 0.453592;

        // Calculate the BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display the calculated BMI
        System.out.println("BMI is " + bmi);

        // Interpret and display the BMI result
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
