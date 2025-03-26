package sriza.solidPrinciples.designPattern.strategyDesignPattern;

public class PaymentMain {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // paying with credit card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100);

        // Paying with paypal
        cart.setPaymentStrategy(new PaypalPayment("user@gmail.com"));
        cart.checkout(100);

        //paying with Bitcoin
        cart.setPaymentStrategy(new BitCoinPayment("1A2ZDE5678GRTYD"));
        cart.checkout(100);
    }
}
