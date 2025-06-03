package designPattern.mediatorDesignPattern;

import java.util.Collection;

public interface ChatMediator {

    void sendMessage(String message, User sender, String recipient);
    void registerUser(User user);

    User getUserByName(String name);

    Collection<User> getAllUsers();
}
