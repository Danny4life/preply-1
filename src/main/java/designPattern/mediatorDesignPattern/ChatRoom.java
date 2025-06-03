package designPattern.mediatorDesignPattern;

import verlaClasses.oop.classActivity4.Paper;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// Concrete Mediator
public class ChatRoom implements ChatMediator {

    private final Map<String, User> users = new HashMap<>();

    @Override
    public void sendMessage(String message, User sender, String recipientName) {

        if(recipientName == null || recipientName.isEmpty()){
            for(User user : users.values()){
                if(!user.getName().equals(sender.getName())){
                    user.receive(sender.getName(), message, false);

                }

            }

        }else {
            User recipient = users.get(recipientName);
            if(recipient != null){
                recipient.receive(sender.getName(), message, true);

            }else {
                sender.receive("System", "User '" + recipientName + "' not found.", true);
            }
        }

    }

    @Override
    public void registerUser(User user) {
        users.put(user.getName(), user);

    }

    @Override
    public User getUserByName(String name) {
        return users.get(name);
    }

    @Override
    public Collection<User> getAllUsers() {
        return users.values();
    }
}
