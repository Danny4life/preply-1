package sriza.solidPrinciples.classActivity4;

public class RegularDiscount implements Discount{
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.1;
    }
}
