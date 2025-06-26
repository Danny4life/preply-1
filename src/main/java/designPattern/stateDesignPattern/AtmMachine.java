package designPattern.stateDesignPattern;

import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {

        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to State Pattern ATM");
        System.out.println("Commands: insert, pin <number>, withdraw <amount>, eject, exit");

        while (true){
            System.out.println("\n> ");
            String input = scanner.nextLine().trim();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("Exiting ATM.");
                break;

            }


            String[] parts = input.split(" ");
            String command = parts[0].toLowerCase();

            switch (command){
                case "insert":
                    atm.insertCard();
                    break;
                case "pin":
                    if(parts.length == 2){
                        try{
                            int pin = Integer.parseInt(parts[1]);
                            atm.enteredPin(pin);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid PIN format.");
                        }
                    }else {
                        System.out.println("Usage: pin <number>");
                    }
                    break;
                case "withdraw":
                    if(parts.length == 2){
                        try{
                            double amount = Double.parseDouble(parts[1]);
                            atm.withdrawMoney(amount);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid amount format.");
                        }

                    }else {
                        System.out.println("Usage: withdraw <amount>");
                    }
                    break;
                case "eject":
                    atm.ejectCard();
                    break;
                default:
                    System.out.println("Unknown command");
            }

        }

        scanner.close();

    }
}
