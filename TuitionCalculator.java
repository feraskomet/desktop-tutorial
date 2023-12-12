public class TuitionCalculator {
    public static void main(String[] args) {
        double tuition = 10000;
        double increaseRate = 0.05;
        int numberOfYears = 10;
        double totalCost = 0;

        for (int year = 1; year <= numberOfYears; year++) {
            tuition *= 1 + increaseRate; // Increase tuition by 5%
            System.out.println("Year " + year + " Tuition: $" + tuition);

            if (year > numberOfYears - 4) {
                totalCost += tuition;
            }
        }

        System.out.println("Total cost of last four years' tuition: $" + totalCost);
    }
}
