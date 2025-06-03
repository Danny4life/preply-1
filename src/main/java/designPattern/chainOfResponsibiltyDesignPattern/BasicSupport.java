package designPattern.chainOfResponsibiltyDesignPattern;

public class BasicSupport extends SupportHandler{

    @Override
    public void handleRequest(String issueType) {
        if("basic".equalsIgnoreCase(issueType)){
            System.out.println("BasicSupport: Handled the issue.");

        } else if (next != null) {
            System.out.println("BasicSupport: Escalating...");
            next.handleRequest(issueType);

        }
    }
}
