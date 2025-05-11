package designPattern.facadeDesignPattern;

// Subsystem 2
public class InvestmentService {

    public void investInFixedDeposit(String name, double amount){
        System.out.println(name + " invested $" + amount + " in a fixed deposit");
    }
}
