package hamlin_lesson.unit1.classActivity2;

import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for weight and height
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Print exact BMI (decimal)
        System.out.println("Your BMI (decimal) = " + bmi);

        // Print truncated BMI (integer)
        int truncatedBMI = (int) bmi;
        System.out.println("Your BMI (truncated) = " + truncatedBMI);

        input.close();
    }
}
