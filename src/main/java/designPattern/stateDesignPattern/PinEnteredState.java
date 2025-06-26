package designPattern.stateDesignPattern;

public class PinEnteredState implements ATMstate{

    private ATM atm;

    public PinEnteredState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");

    }

    @Override
    public void enterPin(int pin) {
        System.out.println("PIN already entered.");

    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("Withdrawing $ " + amount);
        atm.setState(atm.getTransactionInProgressState());

    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atm.setState(atm.getNoCardState());

    }
}
