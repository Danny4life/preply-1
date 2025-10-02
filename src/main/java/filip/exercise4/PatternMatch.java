package filip.exercise4;


import java.util.List;

/**
 * function length(list):
 *     if list is empty:
 *         return 0
 *     else:
 *         return 1 + length(tail of list)
 *
 *         Explanation:
 *
 * Base case: An empty list has length 0.
 *
 * Recursive case: A non-empty list has 1 + length(remaining elements).
 */
public class PatternMatch {

    public static int length(List<?> list) {
        // Base case (pattern: empty list)
        if (list == null || list.isEmpty()) {
            return 0;
        }

        // Recursive case (pattern: head :: tail)
        return 1 + length(list.subList(1, list.size()));
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);

        System.out.println("Length of list: " + length(numbers)); // Output: 5
    }
}
