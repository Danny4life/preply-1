package designPattern.strategyDesignPattern;

// Concrete Strategy : Bitcoin Payment
public class BitcoinPayment implements PaymentStrategy{

    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Bitcoin Wallet: " + walletAddress);
    }
}
