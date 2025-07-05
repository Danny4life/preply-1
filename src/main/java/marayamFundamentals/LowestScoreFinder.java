package marayamFundamentals;

import java.util.Scanner;

public class LowestScoreFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine(); // Consume the leftover newline

        // Initialize tracking variables
        String lowestName = "";
        String secondLowestName = "";
        int lowestScore = Integer.MAX_VALUE;
        int secondLowestScore = Integer.MAX_VALUE;

        // Loop to get students' names and scores
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter student " + i + "'s name: ");
            String name = input.nextLine();

            System.out.print("Enter " + name + "'s score: ");
            int score = input.nextInt();
            input.nextLine(); // Consume newline

            if (score < lowestScore) {
                // Push current lowest to second lowest
                secondLowestScore = lowestScore;
                secondLowestName = lowestName;

                lowestScore = score;
                lowestName = name;
            } else if (score < secondLowestScore) {
                secondLowestScore = score;
                secondLowestName = name;
            }
        }

        // Output results
        System.out.println("\nStudent with the lowest score: " + lowestName + " (" + lowestScore + ")");
        System.out.println("Student with the second lowest score: " + secondLowestName + " (" + secondLowestScore + ")");

        input.close();
    }
}
