package se.lexicon.calculator;

import java.util.Scanner;

public class Main {
    private static final Calculator calculator = new Calculator();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Calculator ${version}");
        System.out.println("");

        boolean running = true;
        while (running) {
            try {
                running = performCalculation();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println();
            }
        }

        scanner.close();
        System.out.println("Thank you for using the Calculator. Goodbye!");
    }

    /**
     * Performs a single calculation based on user input.
     * @return true to continue, false to exit
     */
    private static boolean performCalculation() {
        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");

        String choice = scanner.nextLine().trim();

        switch (choice) {
            case "1":
                performAddition();
                break;
            case "2":
                performSubtraction();
                break;
            case "3":
                performMultiplication();
                break;
            case "4":
                performDivision();
                break;
            case "5":
                // exit the application
                return false;
            default:
                System.out.println("Invalid choice. Please select 1-5.");
        }

        return true;
    }

    /**
     * Performs addition with multiple operands.
     */
    private static void performAddition() {
        System.out.print("How many numbers do you want to add? ");
        int count = getIntegerInput();
        
        if (count <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        double[] numbers = new double[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = getDoubleInput();
        }

        double result = calculator.add(numbers);
        System.out.printf("Result: %.2f%n", result);
    }

    /**
     * Performs subtraction with multiple operands.
     */
    private static void performSubtraction() {
        System.out.print("How many numbers do you want to subtract? ");
        int count = getIntegerInput();
        
        if (count <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        double[] numbers = new double[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = getDoubleInput();
        }

        double result = calculator.subtract(numbers);
        System.out.printf("Result: %.2f%n", result);
    }

    /**
     * Performs multiplication with two operands.
     */
    private static void performMultiplication() {
        System.out.print("Enter first number: ");
        double a = getDoubleInput();
        System.out.print("Enter second number: ");
        double b = getDoubleInput();

        double result = calculator.multiply(a, b);
        System.out.printf("Result: %.2f%n", result);
    }

    /**
     * Performs division with two operands.
     */
    private static void performDivision() {
        System.out.print("Enter dividend: ");
        double a = getDoubleInput();
        System.out.print("Enter divisor: ");
        double b = getDoubleInput();

        double result = calculator.divide(a, b);
        System.out.printf("Result: %.2f%n", result);
    }

    /**
     * Reads an integer from user input with error handling.
     * @return the integer entered by the user
     */
    private static int getIntegerInput() {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid integer: ");
            }
        }
    }

    /**
     * Reads a double from user input with error handling.
     * @return the double entered by the user
     */
    private static double getDoubleInput() {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
}
