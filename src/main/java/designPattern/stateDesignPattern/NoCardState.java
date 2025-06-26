package designPattern.stateDesignPattern;

public class NoCardState implements ATMstate{

    private ATM atm;

    public NoCardState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted");
        atm.setState(atm.getCardInsertedState());


    }

    @Override
    public void enterPin(int pin) {
        System.out.println("No card inserted. Please insert a card first");

    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("No card inserted. Please insert a card first.");

    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject.");

    }
}
