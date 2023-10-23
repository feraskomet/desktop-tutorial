import java.util.Scanner;

public class DaysInMonthCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for month and year
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Close the scanner to prevent resource leak
        input.close();

        // Get the name of the month
        String monthName = getMonthName(month);

        // Calculate and show the number of days
        int days = 0;
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                days = 29;
            } else {
                days = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else {
            days = 31;
        }

        // Print the result
        System.out.println(monthName + " " + year + " had " + days + " days.");
    }

    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }
}

