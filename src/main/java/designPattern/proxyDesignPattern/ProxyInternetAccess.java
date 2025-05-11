package designPattern.proxyDesignPattern;

public class ProxyInternetAccess implements InternetAccess{

    private final String employeeName;
    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    private boolean isAdmin(String user){
        return "Admin".equalsIgnoreCase(user);
    }

    @Override
    public void grantAccess() {
        if(isAdmin(employeeName)){
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantAccess();
        }else {
            System.out.println("Access denied to: " + employeeName);
        }

    }
}
