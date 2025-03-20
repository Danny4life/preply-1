package sriza.unitTesting.classActivity1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddTwoNumbers() {
        // First step - you create an object of the class you want to test
        Calculator cal = new Calculator();

        // Second step - you declare your actual and expected value
        int actualValue = cal.addNumbers(5,5);

        int expectedValue = 10;

        // Third step - you call the assertEquals method between the expected and actual value
        assertEquals(expectedValue, actualValue);

    }

    @Test
    void subtractTwoNumbers() {
        // First step - you create an object of the class you want to test
        Calculator cal = new Calculator();

        // Second step - you declare your actual and expected value
        int actualValue = cal.subtractTwoNumbers(10,5);

        int expectedValue = 5;

        // Third step - you call the assertEquals method between the expected and actual value
        assertEquals(expectedValue, actualValue);
    }
}