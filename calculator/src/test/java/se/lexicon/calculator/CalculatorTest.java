package se.lexicon.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test class for Calculator.
 */
@DisplayName("Calculator Tests")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Nested
    @DisplayName("Addition Tests")
    class AdditionTests {

        @Test
        @DisplayName("Should add two positive numbers")
        void testAddTwoNumbers() {
            double result = calculator.add(5, 3);
            assertEquals(8, result, 0.001);
        }

        @Test
        @DisplayName("Should add multiple numbers")
        void testAddMultipleNumbers() {
            double result = calculator.add(1, 2, 3, 4, 5);
            assertEquals(15, result, 0.001);
        }

        @Test
        @DisplayName("Should return zero when adding no numbers")
        void testAddNoNumbers() {
            double result = calculator.add();
            assertEquals(0, result, 0.001);
        }

        @Test
        @DisplayName("Should handle negative numbers")
        void testAddNegativeNumbers() {
            double result = calculator.add(-5, -3, 2);
            assertEquals(-6, result, 0.001);
        }
    }

    @Nested
    @DisplayName("Subtraction Tests")
    class SubtractionTests {

        @Test
        @DisplayName("Should subtract two positive numbers")
        void testSubtractTwoNumbers() {
            double result = calculator.subtract(10, 3);
            assertEquals(7, result, 0.001);
        }

        @Test
        @DisplayName("Should subtract multiple numbers")
        void testSubtractMultipleNumbers() {
            double result = calculator.subtract(20, 5, 3, 2);
            assertEquals(10, result, 0.001);
        }

        @Test
        @DisplayName("Should throw exception when subtracting no numbers")
        void testSubtractNoNumbers() {
            assertThrows(IllegalArgumentException.class, () -> calculator.subtract());
        }

        @Test
        @DisplayName("Should handle negative numbers")
        void testSubtractNegativeNumbers() {
            double result = calculator.subtract(10, -5);
            assertEquals(15, result, 0.001);
        }
    }

    @Nested
    @DisplayName("Multiplication Tests")
    class MultiplicationTests {

        @Test
        @DisplayName("Should multiply two positive numbers")
        void testMultiplyPositiveNumbers() {
            double result = calculator.multiply(4, 5);
            assertEquals(20, result, 0.001);
        }

        @Test
        @DisplayName("Should handle negative numbers")
        void testMultiplyNegativeNumbers() {
            double result = calculator.multiply(-3, 4);
            assertEquals(-12, result, 0.001);
        }

        @Test
        @DisplayName("Should return zero when multiplying by zero")
        void testMultiplyWithZero() {
            double result = calculator.multiply(5, 0);
            assertEquals(0, result, 0.001);
        }

        @Test
        @DisplayName("Should handle decimal numbers")
        void testMultiplyDecimals() {
            double result = calculator.multiply(2.5, 4);
            assertEquals(10, result, 0.001);
        }
    }

    @Nested
    @DisplayName("Division Tests")
    class DivisionTests {

        @Test
        @DisplayName("Should divide two positive numbers")
        void testDividePositiveNumbers() {
            double result = calculator.divide(20, 4);
            assertEquals(5, result, 0.001);
        }

        @Test
        @DisplayName("Should handle negative numbers")
        void testDivideNegativeNumbers() {
            double result = calculator.divide(-20, 4);
            assertEquals(-5, result, 0.001);
        }

        @Test
        @DisplayName("Should handle decimal results")
        void testDivideDecimals() {
            double result = calculator.divide(7, 2);
            assertEquals(3.5, result, 0.001);
        }

        @Test
        @DisplayName("Should throw exception when dividing by zero")
        void testDivideByZero() {
            assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        }

        @Test
        @DisplayName("Should return zero when dividing zero")
        void testDivideZero() {
            double result = calculator.divide(0, 5);
            assertEquals(0, result, 0.001);
        }
    }
}
