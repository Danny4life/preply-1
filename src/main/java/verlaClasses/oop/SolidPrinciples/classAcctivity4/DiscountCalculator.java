package verlaClasses.oop.SolidPrinciples.classAcctivity4;

public class DiscountCalculator {

    public double calculateDiscount(Discount discount, double amount){

        return discount.applyDiscount(amount);

    }
}
