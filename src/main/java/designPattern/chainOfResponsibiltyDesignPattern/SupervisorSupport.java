package designPattern.chainOfResponsibiltyDesignPattern;

public class SupervisorSupport extends SupportHandler{
    @Override
    public void handleRequest(String issueType) {
        if("intermediate".equalsIgnoreCase(issueType)){
            System.out.println("SupervisorSupport: Handled the issue");

        } else if (next != null) {
            System.out.println("SupervisorSupport: Escalating...");
            next.handleRequest(issueType);

        }
    }
}
