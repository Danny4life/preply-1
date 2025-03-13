package generics.classActivity6;

import java.util.List;

public class WildCardsGenerics {

    public static void printList(List<?> list){

        for(Object obj : list){
            System.out.print(obj + " ");
        }

        System.out.println();

    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<String> strList = List.of("A", "B", "C");

        printList(intList);
        printList(strList);
    }
}
