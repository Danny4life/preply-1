package filip.exercise6;

import java.util.*;

/**
 * Takes a list of words.
 *
 * Counts the frequency of each word.
 *
 * Keeps only unique words.
 *
 * Sorts them by frequency of occurrence (highest → lowest).
 */
public class ListOfWords {
    public static List<AbstractMap.SimpleEntry<String, Integer>> getWordFrequencies(List<String> words) {
        // Step 1: Count frequencies
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Step 2: Convert map to list of entries
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        // Step 3: Sort by frequency (descending), then alphabetically
        entryList.sort((a, b) -> {
            int freqCompare = b.getValue().compareTo(a.getValue());
            if (freqCompare == 0) {
                return a.getKey().compareTo(b.getKey());
            }
            return freqCompare;
        });

        // Step 4: Convert to List of SimpleEntry (tuple style)
        List<AbstractMap.SimpleEntry<String, Integer>> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            result.add(new AbstractMap.SimpleEntry<>(entry.getKey(), entry.getValue()));
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "apple", "pear"
        );

        List<AbstractMap.SimpleEntry<String, Integer>> frequencies = getWordFrequencies(words);

        // Print result in desired format: [("apple", 3), ("banana", 2), ...]
        System.out.print("[");
        for (int i = 0; i < frequencies.size(); i++) {
            var entry = frequencies.get(i);
            System.out.print("(\"" + entry.getKey() + "\", " + entry.getValue() + ")");
            if (i < frequencies.size() - 1) {
                System.out.print("; ");
            }
        }
        System.out.println("]");
    }
}
