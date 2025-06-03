package designPattern.chainOfResponsibiltyDesignPattern;

public class ManagerSupport extends SupportHandler{
    @Override
    public void handleRequest(String issueType) {
        if("critical".equalsIgnoreCase(issueType)){
            System.out.println("ManagementSupport: Handled the issue");

        }else {
            System.out.println("ManagementSupport: Cannot handle the issue");
        }
    }
}
