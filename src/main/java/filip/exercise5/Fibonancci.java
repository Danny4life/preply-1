package filip.exercise5;

/**
 * function fib(n):
 *     if n == 0:
 *         return 0   // base case
 *     if n == 1:
 *         return 1   // base case
 *
 *     return fib(n - 1) + fib(n - 2)   // recursive case
 */

public class Fibonancci {

    public static int fib(int n) {
        if (n == 0) {
            return 0; // base case
        }
        if (n == 1) {
            return 1; // base case
        }
        return fib(n - 1) + fib(n - 2); // recursive case
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci(" + n + ") = " + fib(n));
    }
}
