package se.lexicon.calculator;

public class Calculator {

    /**
     * Addition
     * @param numbers the numbers to add
     * @return the sum
     */
    public double add(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * Subtracts any number of operands from the first operand.
     * @param numbers the numbers to subtract with the first number as the starting value
     * @return the sum
     * @throws IllegalArgumentException if no numbers are provided
     */
    public double subtract(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required");
        }
        
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    /**
     * multiplication
     * @param a
     * @param b
     * @return the product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides two numbers.
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
