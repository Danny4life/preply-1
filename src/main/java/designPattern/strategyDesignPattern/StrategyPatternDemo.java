package designPattern.strategyDesignPattern;

public class StrategyPatternDemo {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // Paying with Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkOut(100);

        // Paying with Paypal
        cart.setPaymentStrategy(new PaypalPayment("user@example.com"));
        cart.checkOut(50);

        // Paying with Bitcoin
        cart.setPaymentStrategy(new BitcoinPayment("1A2b3C4dyhgOK0PlouH9"));
        cart.checkOut(75);



    }
}
