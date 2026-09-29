public class IT26101786Lab9Q3 {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to square an integer
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Calculate: (3 * 4 + 5 * 7)²
        int term1 = multiply(3, 4);
        int term2 = multiply(5, 7);
        int expression1 = square(add(term1, term2));

        // Calculate: (4 + 7)² + (8 + 3)²
        int term3 = square(add(4, 7));
        int term4 = square(add(8, 3));
        int expression2 = add(term3, term4);

        // Print results matching the expected output layout
        System.out.println("Result of (3 * 4 + 5 * 7)²   : " + expression1);
        System.out.println("Result of (4 + 7)² + (8 + 3)²   : " + expression2);
    }
}