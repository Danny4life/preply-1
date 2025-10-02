package filip.exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * function squareList(numbers):
 *     create empty list result
 *
 *     for each num in numbers:
 *         add (num * num) to result
 *
 *     return result
 */
public class TransformingIntegers {

    public static List<Integer> squareList(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int num : numbers) {
            result.add(num * num);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squared = squareList(nums);

        System.out.println("Original list: " + nums);
        System.out.println("Squared list: " + squared);
    }
}
