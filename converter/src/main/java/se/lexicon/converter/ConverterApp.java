package se.lexicon.converter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 * CLI for unit conversions
 */
public class ConverterApp {

    private static final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = getMenuChoice();

            switch (choice) {
                case 1:
                    temperatureConverter();
                    break;
                case 2:
                    lengthConverter();
                    break;
                case 3:
                    timeConverter();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }

        scanner.close();
    }

    /**
     * Display the main menu
     */
    private static void displayMenu() {
        System.out.println("\n=== Converter App ===");
        System.out.println("1. Temperature Converter (Celsius <-> Fahrenheit)");
        System.out.println("2. Length Converter (Meters <-> Kilometers)");
        System.out.println("3. Time Converter (Hours <-> Minutes)");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    /**
     * Get the user's menu choice
     */
    private static int getMenuChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /**
     * Count decimal places in input string
     */
    private static int countDecimalPlaces(String input) {
        if (!input.contains(".")) {
            return 0;
        }
        String[] parts = input.split("\\.");
        if (parts.length < 2) {
            return 0;
        }
        return parts[1].length();
    }

    /**
     * Format number with appropriate precision
     * Uses input precision, but ensures small results remain visible
     */
    private static String formatNumber(double value, int inputPrecision) {
        // Round to avoid floating point errors
        double rounded = Math.round(value * Math.pow(10, inputPrecision + 2)) / Math.pow(10, inputPrecision + 2);
        
        // If result would be effectively zero with input precision, use more decimal places
        if (rounded != 0 && Math.abs(rounded) < Math.pow(10, -inputPrecision)) {
            // Find appropriate precision to show the value
            int precision = inputPrecision;
            while (precision < 10 && Math.abs(rounded) < Math.pow(10, -precision)) {
                precision++;
            }
            String formatStr = String.format(Locale.US, "%%.%df", Math.min(precision + 2, 6));
            return String.format(Locale.US, formatStr, rounded);
        }
        
        // Use input precision
        String formatStr = String.format(Locale.US, "%%.%df", inputPrecision);
        return String.format(Locale.US, formatStr, rounded);
    }

    /**
     * Temperature converter: Celsius <-> Fahrenheit
     */
    private static void temperatureConverter() {
        System.out.println("\n--- Temperature Converter ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose conversion: ");

        int choice = getMenuChoice();

        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice.");
            return;
        }

        try {
            System.out.print("Enter temperature value: ");
            String inputStr = scanner.nextLine();
            double value = Double.parseDouble(inputStr);
            int precision = countDecimalPlaces(inputStr);

            double result;
            String conversion;

            if (choice == 1) {
                result = celsiusToFahrenheit(value);
                conversion = formatNumber(value, precision) + " °C = " + formatNumber(result, precision) + " °F";
            } else {
                result = fahrenheitToCelsius(value);
                conversion = formatNumber(value, precision) + " °F = " + formatNumber(result, precision) + " °C";
            }

            displayResult(conversion);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    /**
     * Convert Celsius to Fahrenheit
     */
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Convert Fahrenheit to Celsius
     */
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Length converter: Meters <-> Kilometers
     */
    private static void lengthConverter() {
        System.out.println("\n--- Length Converter ---");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.print("Choose conversion: ");

        int choice = getMenuChoice();

        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice.");
            return;
        }

        try {
            System.out.print("Enter length value: ");
            String inputStr = scanner.nextLine();
            double value = Double.parseDouble(inputStr);
            int precision = countDecimalPlaces(inputStr);

            if (value < 0) {
                System.out.println("Length cannot be negative.");
                return;
            }

            double result;
            String conversion;

            if (choice == 1) {
                result = metersToKilometers(value);
                conversion = formatNumber(value, precision) + " m = " + formatNumber(result, precision) + " km";
            } else {
                result = kilometersToMeters(value);
                conversion = formatNumber(value, precision) + " km = " + formatNumber(result, precision) + " m";
            }

            displayResult(conversion);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    /**
     * Convert Meters to Kilometers
     */
    private static double metersToKilometers(double meters) {
        return meters / 1000;
    }

    /**
     * Convert Kilometers to Meters
     */
    private static double kilometersToMeters(double kilometers) {
        return kilometers * 1000;
    }

    /**
     * Time converter: Hours <-> Minutes
     */
    private static void timeConverter() {
        System.out.println("\n--- Time Converter ---");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Minutes to Hours");
        System.out.print("Choose conversion: ");

        int choice = getMenuChoice();

        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice.");
            return;
        }

        try {
            System.out.print("Enter time value: ");
            String inputStr = scanner.nextLine();
            double value = Double.parseDouble(inputStr);
            int precision = countDecimalPlaces(inputStr);

            if (value < 0) {
                System.out.println("Time cannot be negative.");
                return;
            }

            double result;
            String conversion;

            if (choice == 1) {
                result = hoursToMinutes(value);
                conversion = formatNumber(value, precision) + " hours = " + formatNumber(result, precision) + " minutes";
            } else {
                result = minutesToHours(value);
                conversion = formatNumber(value, precision) + " minutes = " + formatNumber(result, precision) + " hours";
            }

            displayResult(conversion);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    /**
     * Convert Hours to Minutes
     */
    private static double hoursToMinutes(double hours) {
        return hours * 60;
    }

    /**
     * Convert Minutes to Hours
     */
    private static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    /**
     * Display the conversion result with timestamp
     */
    private static void displayResult(String conversion) {
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.println("\nResult: " + conversion);
        System.out.println("Converted at: " + timestamp);
    }
}
