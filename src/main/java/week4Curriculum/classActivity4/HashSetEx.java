package week4Curriculum.classActivity4;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> count = new HashSet<>();

        count.add("one");
        count.add("two");
        count.add("three");
        count.add("four");
        count.add("five");
        count.add("five");


        //count.remove("one");



        Iterator<String> iterator = count.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
