package designPattern.proxyDesignPattern;

public class RealInternetAccess implements InternetAccess{


    private final String employeeName;

    public RealInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantAccess() {

        System.out.println("Internet Access granted to: " + employeeName);

    }
}
