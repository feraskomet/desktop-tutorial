public class MileToKilometerConverter {
    public static void main(String[] args) {
        // Display the table header
        System.out.println("Miles    Kilometers");
        System.out.println("-------------------");

        // Convert and display miles to kilometers for 1 to 10 miles
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * 1.609;
            System.out.println(miles + "         " + kilometers);
        }
    }
}