package sriza.solidPrinciples.designPattern.strategyDesignPattern;

public class BitCoinPayment implements PaymentStrategy{

    private String walletAddress;

    public BitCoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Bitcoin Wallet: " + walletAddress);
    }
}
