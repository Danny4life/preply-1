package sriza.solidPrinciples.classActivity4;

public class Main {
    public static void main(String[] args) {

        DiscountCalculator calculator = new DiscountCalculator();

        Discount regularCustomer = new RegularDiscount();
        Discount vipCustomer = new VipDiscount();


        System.out.println("Regular Discount: $" + calculator.calculateDiscount(regularCustomer, 100));
        System.out.println("Vip Discount: $" + calculator.calculateDiscount(vipCustomer, 200));
    }
}
