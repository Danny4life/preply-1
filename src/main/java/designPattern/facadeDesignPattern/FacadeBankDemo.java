package designPattern.facadeDesignPattern;

public class FacadeBankDemo {

    public static void main(String[] args) {

        BankService bankService = new BankService();



        bankService.openAccount("John Doe");
        bankService.applyLoan("John Doe", 10000000);
        bankService.investInFD("John Doe", 500000);
    }
}
