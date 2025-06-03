package week4Curriculum.classActivity6;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<Integer> num = new LinkedList<>();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        for(Integer i : num){
            System.out.println(i);
        }
    }
}
