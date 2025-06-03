package week4Curriculum.classActivity9;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(10);
        list.add("10"); //compile time error when we use generics, that is type safety
        // add generics to show its usefulness

        System.out.println(list);
    }
}
