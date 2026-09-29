import java.util.Scanner;

public class IT26101786Lab9Q2 {

    // Method to calculate and return the area of the circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the radius value from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Call the circleArea method and calculate the result
        double area = circleArea(radius);

        // Display the result matching the expected output format
        System.out.println("The area of the circle with radius " + radius + " is : " + area);

    }
}