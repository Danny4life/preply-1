package designPattern.strategyDesignPattern;

public class CreditCardPayment implements PaymentStrategy{


    private String creditCard;

    public CreditCardPayment(String creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card: " + creditCard);

    }
}
