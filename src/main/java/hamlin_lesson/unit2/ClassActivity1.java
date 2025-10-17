package hamlin_lesson.unit2;

import java.util.Scanner;

public class ClassActivity1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();


        if(num1 > num2){
            System.out.println("First number is larger than second number");
        } else if (num1 < num2) {
            System.out.println("First number is smaller than second number");
            
        }else {
            System.out.println("First number is equal to second number");
        }
    }
}
