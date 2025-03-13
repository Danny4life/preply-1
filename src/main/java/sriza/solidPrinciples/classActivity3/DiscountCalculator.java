package sriza.solidPrinciples.classActivity3;

public class DiscountCalculator {

    public double calculateDiscount(String customerType, double amount){

        if(customerType.equals("Regular")){
            return amount * 0.1;

        } else if (customerType.equals("VIP")) {
            return amount * 0.2;

        } else if (customerType.equals("GOLD")) {

            return amount * 0.4;

        } else if (customerType.equals("SILVER")) {
            return amount * 0.5;

        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println("Regular Discount: $" + calculator.calculateDiscount("Regular", 100));
        System.out.println("VIP Discount: $" + calculator.calculateDiscount("VIP", 100));

    }
}
