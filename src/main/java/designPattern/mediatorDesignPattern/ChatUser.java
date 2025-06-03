package designPattern.mediatorDesignPattern;

public class ChatUser extends User{
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message, String toUser) {
        mediator.sendMessage(message, this, toUser);

    }

    @Override
    public void receive(String from, String message, boolean isPrivate) {
        if(isPrivate){
            System.out.println(" [Private] " + from + " " + name + ": " + message);

        }else {
            System.out.println(" [Broadcast] " + from + " " + name + ": " + message);

        }

    }
}
