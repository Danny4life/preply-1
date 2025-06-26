package designPattern.stateDesignPattern;

public interface ATMstate {
    void insertCard();
    void enterPin(int pin);
    void withdrawMoney(double amount);
    void ejectCard();
}
