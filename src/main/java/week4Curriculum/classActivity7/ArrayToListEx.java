package week4Curriculum.classActivity7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListEx {
    public static void main(String[] args) {
        // create an array
        String[] stacks = {"Java", "Net", "Node"};

        System.out.println("Array : " + Arrays.toString(stacks));

        System.out.println("*********************");

        // converting array to list
        List<String> language = new ArrayList<>();
        for(String s : stacks){
            language.add(s);
        }
        System.out.println("List : " + language);
    }
}
