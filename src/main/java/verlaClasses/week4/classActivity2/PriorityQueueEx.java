package verlaClasses.week4.classActivity2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

    // Do research on this
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();


        queue.add("two");
        queue.add("three");
        queue.add("five");
        queue.add("one");
        queue.add("four");


        // lexicographical ordering




        Iterator<String> iterator = queue.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
