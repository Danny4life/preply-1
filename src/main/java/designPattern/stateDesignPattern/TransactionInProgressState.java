package designPattern.stateDesignPattern;

public class TransactionInProgressState implements ATMstate{

    private ATM atm;

    public TransactionInProgressState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Transaction in progress. Please wait...");

    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Transaction in progress...");

    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("Transaction already in progress...");

    }

    @Override
    public void ejectCard() {
        System.out.println("Transaction complete. Card ejected.");
        atm.setState(atm.getNoCardState());

    }
}
