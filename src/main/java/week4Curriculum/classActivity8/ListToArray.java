package week4Curriculum.classActivity8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Mango");
        fruits.add("Mango");
        fruits.add("Mango");
        fruits.add("Mango");

        String[] convert = fruits.toArray(new String[0]);
        System.out.println("Array : " + Arrays.toString(convert));
        // use this to show the importance of toString and why we override it for arrays
        //System.out.println(convert);

        System.out.println("*************");
        System.out.println("List : " + fruits);
    }
}
