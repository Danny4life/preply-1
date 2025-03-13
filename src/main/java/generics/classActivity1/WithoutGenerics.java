package generics.classActivity1;

import java.util.ArrayList;

public class WithoutGenerics {

    public static void main(String[] args) {

        // Create a list that holds objects (No Generics)

        ArrayList list = new ArrayList();

        // Adding elements of different types
        list.add("Hello"); // String
        list.add(123); // Integer
        list.add(45.2); // Double

        String text = (String) list.get(0);
        System.out.println("Text " + text);

        String number = (String) list.get(1); // Runtime Error
        System.out.println("Number " + number);
    }
}
