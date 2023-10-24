import java.util.Scanner;

public class EliminateDuplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store ten numbers
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        int[] distinctNumbers = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int uniqueCount = 0;

        // Check each number in the list
        for (int i = 0; i < list.length; i++) {
            if (!isInArray(temp, uniqueCount, list[i])) {
                temp[uniqueCount] = list[i];
                uniqueCount++;
            }
        }

        // Copy only unique numbers to a new array
        int[] result = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        
        return result;
    }

    // This helper method checks if a number is in the array or not
    public static boolean isInArray(int[] array, int length, int value) {
        for (int i = 0; i < length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
