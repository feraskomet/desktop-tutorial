import java.util.Scanner;

public class VowelOrConsonantChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        String input = scanner.nextLine();

        if (input.length() == 1 && isLetter(input)) {
            if (isVowel(input)) {
                System.out.println(input + " is a vowel");
            } else {
                System.out.println(input + " is a consonant");
            }
        } else {
            System.out.println(input + " is an invalid input");
        }
    }

    public static boolean isLetter(String s) {
        return s.charAt(0) >= 'A' && s.charAt(0) <= 'Z' || s.charAt(0) >= 'a' && s.charAt(0) <= 'z';
    }

    public static boolean isVowel(String s) {
        char ch = Character.toLowerCase(s.charAt(0));
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
