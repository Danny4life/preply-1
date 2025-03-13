package generics.classActivity2;

import java.util.ArrayList;

public class WithGenerics {

    public static void main(String[] args) {
        // Creating a list that holds only String (Generics Used)

        ArrayList<String> list = new ArrayList<>(); // this is for default generics

        // Adding elements (This will only accept Strings Type)
        list.add("Hello");
        list.add("World");
        //list.add(1234);   // Compile time error - this helps ensure type safety

        String text1 = list.get(0);
        String text2 = list.get(1);

        System.out.println(text1);
        System.out.println(text2);
    }
}
