package designPattern.proxyDesignPattern;

public class ProxyPatternDemo {

    public static void main(String[] args) {

        InternetAccess adminAccess = new ProxyInternetAccess("Admin");
        adminAccess.grantAccess();

        InternetAccess studentAccess = new ProxyInternetAccess("Student");
        studentAccess.grantAccess();
    }
}
