package designPattern.chainOfResponsibiltyDesignPattern;

public class SupportSystem {

    public static void main(String[] args) {

        SupportHandler basic = new BasicSupport();
        SupportHandler supervisor = new SupervisorSupport();
        SupportHandler manager = new ManagerSupport();

        // Chain: Basic -> Supervisor -> Manager
        basic.setNext(supervisor);
        supervisor.setNext(manager);

        // Client sends different request
        basic.handleRequest("basic"); // Handled by BasicSupport
        basic.handleRequest("intermediate"); // Escalated to SupervisorSupport
        basic.handleRequest("critical"); // Escalated to ManagerSupport
        basic.handleRequest("unknown"); // Escalated and unhandled
    }
}
