import java.util.Scanner;

public class IT26101786Lab9Q4 {

    // a) Method to calculate final mark (30% assignment, 70% exam)
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    // b) Method to determine grade based on the final mark
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // c) Method to print the headers and details of a student
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-12s %-5s%n", name, finalMark, grade);
    }

    // d) Main method to handle inputs and manage 5 students
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays to store the data of 5 students
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        // Input loop for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            
            System.out.print("Enter Name: ");
            names[i] = scanner.nextLine();
            
            System.out.print("Enter Assignment Mark (out of 100): ");
            double assignmentMark = scanner.nextDouble();
            
            System.out.print("Enter Exam Paper Mark (out of 100): ");
            double examMark = scanner.nextDouble();
            scanner.nextLine(); // Clear the scanner buffer
            
            // Calculate final mark and find grade using the methods
            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
            System.out.println(); // Blank line for readability
        }

        // Display results table
        System.out.println("---------------------------------------");
        System.out.printf("%-15s %-12s %-5s%n", "Name", "Final Mark", "Grade");
        System.out.println("---------------------------------------");
        
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
        System.out.println("---------------------------------------");
        
        scanner.close();
    }
}