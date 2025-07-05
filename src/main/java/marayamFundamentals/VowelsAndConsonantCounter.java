package marayamFundamentals;

import java.util.Scanner;

public class VowelsAndConsonantCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine().toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        input.close();
    }
}
