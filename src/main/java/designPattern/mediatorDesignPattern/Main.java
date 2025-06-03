package designPattern.mediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ChatMediator chatRoom = new ChatRoom();

        System.out.println("=== Chat Simulator ===");
        System.out.println("Enter number of users to register: ");
        int userCount = Integer.parseInt(scanner.nextLine());

        List<User> users = new ArrayList<>();

        for(int i = 0; i < userCount; i++){
            System.out.println("Enter username #" + (i + 1) + ": ");
            String name = scanner.nextLine().trim();

            User user = new ChatUser(chatRoom, name);
            chatRoom.registerUser(user);
            users.add(user);
        }

        System.out.println("\nUsers registered: ");
        for(User user : users){
            System.out.println(" - " + user.getName());

        }

        System.out.println("\nStart chatting! Type '/exit' to quit.");
        System.out.println("Command:");
        System.out.println("    /all <message>     -> broadcast to all");
        System.out.println("    /msg <user> <message> -> private message");

        while (true){
            System.out.println("\nSelect sender:");
            for(int i = 0; i < users.size(); i++){
                System.out.println("[" + i + "] " + users.get(i).getName());

            }

            System.out.print("Enter sender number: ");
            int senderIndex;

            try{
                senderIndex = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
                continue;
            }

            if(senderIndex < 0 || senderIndex >= users.size()){
                System.out.println("Invalid user index");
                continue;

            }

            User sender = users.get(senderIndex);

            System.out.print(sender.getName() + " > ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("/exit")){
                System.out.println("Exiting chat....");
                break;

            }

            if(input.startsWith("/all ")){
                String message = input.substring(5);
                sender.send(message, null);

            } else if (input.startsWith("/msg ")) {
                String[] parts = input.split(" ", 3);
                if(parts.length < 3){
                    System.out.println("Invalid format. Use /msg <user> <message>");
                    continue;
                }

                String recipient = parts[1];
                String message = parts[2];
                sender.send(message, recipient);

            }else {
                System.out.println("Unknown command");
            }
        }

        scanner.close();

    }
}
