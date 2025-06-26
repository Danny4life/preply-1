package designPattern.stateDesignPattern;

public class ATM {

    private ATMstate noCardState;
    private ATMstate cardInsertedState;
    private ATMstate pinEnteredState;
    private ATMstate transactionInProgressState;

    private ATMstate currentState;


    public ATM() {
        noCardState = new NoCardState(this);
        cardInsertedState = new CardInsertedState(this);
        pinEnteredState = new PinEnteredState(this);
        transactionInProgressState = new TransactionInProgressState(this);

        currentState = noCardState;

    }

    public void setState(ATMstate state){
        this.currentState = state;

    }

    public ATMstate getNoCardState() {
        return noCardState;
    }

    public ATMstate getCardInsertedState() {
        return cardInsertedState;
    }

    public ATMstate getPinEnteredState() {
        return pinEnteredState;
    }

    public ATMstate getTransactionInProgressState() {
        return transactionInProgressState;
    }

    public void insertCard(){
        currentState.insertCard();
    }

    public void enteredPin(int pin){
        currentState.enterPin(pin);

    }

    public void withdrawMoney(double amount){
        currentState.withdrawMoney(amount);

    }

    public void ejectCard(){
        currentState.ejectCard();
    }
}
