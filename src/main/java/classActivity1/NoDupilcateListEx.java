package classActivity1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NoDupilcateListEx {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(1);
        numberList.add(2);

        System.out.println("Before removing duplicate items");
        System.out.println(numberList);

        System.out.println("After removing duplicate items");
        Set<Integer> removeDuplicates = new HashSet<>(numberList);
        System.out.println(removeDuplicates);
    }
}
