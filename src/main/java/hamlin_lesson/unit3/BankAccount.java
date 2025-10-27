package hamlin_lesson.unit3;

public class BankAccount {
    private double balance;

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }
    public double getBalance() { return balance; }
}
