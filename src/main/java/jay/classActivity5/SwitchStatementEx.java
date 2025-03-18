package jay.classActivity5;

import java.util.Scanner;

public class SwitchStatementEx {

    public static void main(String[] args) {

        // An in-built helper class
        Scanner scanner = new Scanner(System.in); // We are creating a scanner object

        // Ask the user to enter a number between 1 and 7
        System.out.println("Enter a number (1-7)");

        int dayNumber = scanner.nextInt();

        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7");
        }

        scanner.close(); // We do this to prevent memory leaks


    }
}
