import java.util.Scanner;

public class HexagonAreaCalculator {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the side of the hexagon: ");
        double sideLength = scan.nextDouble();
        
        double area = (3 * Math.sqrt(3) * sideLength * sideLength) / 2;
        
        System.out.println("The area of the hexagon is: " + area);
        
        scan.close();
    }
}