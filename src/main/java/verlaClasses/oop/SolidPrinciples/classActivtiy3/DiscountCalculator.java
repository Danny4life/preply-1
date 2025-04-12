package verlaClasses.oop.SolidPrinciples.classActivtiy3;

public class DiscountCalculator {


    public double calculateDiscount(String customerType, double amount){
        if(customerType.equalsIgnoreCase("REGULAR")){
            return amount * 0.1;
        } else if (customerType.equalsIgnoreCase("VIP")) {
            return amount * 0.2;

        } else if (customerType.equalsIgnoreCase("GOLD")) {
            return amount * 0.3;

        } else {
            return 0;
        }

    }

    public static void main(String[] args) {

        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println("REGULAR Discount: $ " + calculator.calculateDiscount("Regular", 100));
        System.out.println("VIP Discount: $ " + calculator.calculateDiscount("Vip", 100));

    }
}
