package designPattern.mediatorDesignPattern;

// Colleague (User)
public abstract class User {

    protected ChatMediator mediator;
    protected String name;


    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message, String toUser);
    public abstract void receive(String from, String message, boolean isPrivate);

    public String getName(){
        return name;
    }


}
