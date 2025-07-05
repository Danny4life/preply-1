package marayamFundamentals;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Scissors", "Rock", "Paper"};

        System.out.print("scissor(0), rock(1), paper(2): ");
        int userChoice = input.nextInt();

        // Validate input
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid choice. Please enter 0, 1, or 2.");
            return;
        }

        int computerChoice = random.nextInt(3); // 0 to 2

        System.out.println("The computer is " + choices[computerChoice] + ".");
        System.out.println("You are " + choices[userChoice] + ".");

        // Determine result
        if (userChoice == computerChoice) {
            System.out.println("It is a draw.");
        } else if ((userChoice == 0 && computerChoice == 2) || // Scissors cuts paper
                (userChoice == 1 && computerChoice == 0) || // Rock beats scissors
                (userChoice == 2 && computerChoice == 1)) { // Paper wraps rock
            System.out.println("You won!");
        } else {
            System.out.println("You lost.");
        }

        input.close();
    }
}
