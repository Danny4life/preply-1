package stack.classActivity2A;

import java.util.Scanner;

public class StackOperations {

    public static void main(String[] args) {

        int choice = 0;

        Scanner scanner = new Scanner(System.in);

        StackArray stackArray = new StackArray();

        System.out.println("************Stack Operations using array***********\n");
        System.out.println("\n--------------------------------------------------\n");

        while (choice != 4){
            System.out.println("\nChose one from the below options....\n");
            System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");
            System.out.println("\nEnter your choice\n");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    stackArray.push(scanner);
                    break;
                case 2:
                    stackArray.pop();
                    break;
                case 3:
                    stackArray.display();
                    break;
                default:
                    System.out.println("You have exited!!!");
            }
        }
    }
}
