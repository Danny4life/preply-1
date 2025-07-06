package verlaClasses.oop.array;

import java.util.Scanner;

public class EvenOrOdd {


    public static void checkEvenOrOdd(){
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        // Close the scanner
        input.close();
    }

    public static void main(String[] args) {
        EvenOrOdd.checkEvenOrOdd();
    }
}
