package filip.exercise1;

/**
 * function factorial(number):
 *     if number == 0 OR number == 1:
 *         return 1   // base case
 *
 *     else:
 *         return number * factorial(number - 1)
 */

public class Recursive {

    // Recursive method to calculate factorial
    public static long recursive(int number) {
        if (number == 0 || number == 1) {  // base case
            return 1;
        }
        return number * recursive(number - 1);  // recursive case
    }

    public static void main(String[] args) {
        int result = 5; // Example input
        System.out.println("Factorial of " + result + " is: " + recursive(result));
    }

    /**
     * How it works:
     *
     * Base case: When n is 0 or 1, factorial is 1.
     *
     * Recursive case: Multiply n by factorial of (n-1).
     *
     *  For factorial(5) → 5 * 4 * 3 * 2 * 1 = 120.
     */
}
