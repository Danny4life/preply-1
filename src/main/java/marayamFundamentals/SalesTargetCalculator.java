package marayamFundamentals;

public class SalesTargetCalculator {
    public static void main(String[] args) {
        final double BASE_SALARY = 5000;
        final double TARGET_INCOME = 30000;
        double sales = 0.01;
        double commission;
        double totalIncome;

        while (true) {
            commission = 0;

            if (sales > 10000) {
                commission += (sales - 10000) * 0.10;
                commission += 5000 * 0.08;
                commission += 5000 * 0.06;
            } else if (sales > 5000) {
                commission += (sales - 5000) * 0.08;
                commission += 5000 * 0.06;
            } else {
                commission += sales * 0.06;
            }

            totalIncome = BASE_SALARY + commission;

            if (totalIncome >= TARGET_INCOME) {
                break;
            }

            sales += 0.01; // Increase by a cent to get the minimum
        }

        System.out.printf("Minimum sales required to earn $30,000: $%.2f\n", sales);
    }

}
