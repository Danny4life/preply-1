package marayamFundamentals;

public class TuitionCalculator {
    public static void main(String[] args) {
        double tuition = 10000;
        double annualIncreaseRate = 0.06;

        // Calculate tuition in 10 years
        for (int year = 1; year <= 10; year++) {
            tuition = tuition + (tuition * annualIncreaseRate);
        }

        System.out.printf("Tuition in 10 years: $%.2f\n", tuition);

        // Calculate total cost for 4 years starting from 11th year
        double totalCost = 0;
        for (int i = 0; i < 4; i++) {
            tuition = tuition + (tuition * annualIncreaseRate);
            totalCost += tuition;
        }

        System.out.printf("Total cost of 4 years after 10th year: $%.2f\n", totalCost);
    }
}
