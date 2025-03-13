package selahattin.classActivity4;

import java.util.Scanner;

public class VariableEx {

    public static void main(String[] args) {

        System.out.println("Enter your first number: ");

        // Scanner class are used to interact with the console
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();


        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();

        int addNumbers = num1 + num2;

        System.out.println(num1 + " + " + num2 + " is = " + addNumbers);

    }
}
