package designPattern.stateDesignPattern;

public class CardInsertedState implements ATMstate{

    private ATM atm;

    public CardInsertedState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");

    }

    @Override
    public void enterPin(int pin) {
        if(pin == 1234){
            System.out.println("Correct PIN");
            atm.setState(atm.getPinEnteredState());
        }else {
            System.out.println("Incorrect PIN.");
        }

    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("Enter Pin first");

    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atm.setState(atm.getNoCardState());

    }
}
