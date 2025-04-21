import java.util.Scanner;

public class PythagorasTheorem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sides a and b
        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        // Calculate hypotenuse c
        double c = Math.sqrt((a * a) + (b * b));

        // Display result
        System.out.printf("The hypotenuse (c) is: %.2f\n", c);
    }
}
