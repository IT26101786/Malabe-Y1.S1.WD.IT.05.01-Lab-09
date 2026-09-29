import java.util.Scanner;

public class IT26101786Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter value a: ");
        double a = input.nextDouble();

        System.out.print("Enter value b: ");
        double b = input.nextDouble();

        System.out.print("Enter value c: ");
        double c = input.nextDouble();

        // Calculate the discriminant: b^2 - 4ac
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        System.out.println(); // Prints the blank line shown in the sample output

        // Determine roots based on the discriminant value
        if (discriminant > 0) {
            System.out.println("Roots are real and different :");
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            
            // Format to two decimal places
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
        } else if (discriminant == 0) {
            System.out.println("Roots are real and equal :");
            double root = -b / (2 * a);
            System.out.printf("Root: %.2f\n", root);
        } else {
            System.out.println("Roots are complex and imaginary.");
        }

    }
}