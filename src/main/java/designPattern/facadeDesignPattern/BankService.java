package designPattern.facadeDesignPattern;

// Facade class
public class BankService {

    private AccountService accountService;

    private LoanService loanService;

    private InvestmentService investmentService;

    public BankService() {
        accountService = new AccountService();
        loanService = new LoanService();
        investmentService = new InvestmentService();
    }

    public void openAccount(String customerName){
        accountService.openAccount(customerName);

    }

    public void applyLoan(String customerName, double amount){
        loanService.applyLoan(customerName, amount);

    }

    public void investInFD(String customerName, double amount){
        investmentService.investInFixedDeposit(customerName, amount);

    }
}
